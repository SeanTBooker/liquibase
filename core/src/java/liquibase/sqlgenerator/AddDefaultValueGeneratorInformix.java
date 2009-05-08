package liquibase.sqlgenerator;

import liquibase.database.Database;
import liquibase.database.SybaseDatabase;
import liquibase.database.structure.Column;
import liquibase.database.structure.Table;
import liquibase.exception.ValidationErrors;
import liquibase.sql.Sql;
import liquibase.sql.UnparsedSql;
import liquibase.statement.AddDefaultValueStatement;

class AddDefaultValueGeneratorInformix extends AddDefaultValueGenerator {
    public int getPriority() {
        return PRIORITY_DATABASE;
    }

    public boolean supports(AddDefaultValueStatement statement, Database database) {
        return database instanceof SybaseDatabase;
    }

    @Override
    public ValidationErrors validate(AddDefaultValueStatement addDefaultValueStatement, Database database) {
        ValidationErrors validationErrors = super.validate(addDefaultValueStatement, database);
        if (addDefaultValueStatement.getColumnDataType() == null) {
            validationErrors.checkRequiredField("columnDataType", addDefaultValueStatement.getColumnDataType());
        }
        return validationErrors;
    }

    public Sql[] generateSql(AddDefaultValueStatement statement, Database database) {

        return new Sql[]{
                new UnparsedSql("ALTER TABLE " + database.escapeTableName(statement.getSchemaName(), statement.getTableName()) + " MODIFY (" + database.escapeColumnName(statement.getSchemaName(), statement.getTableName(), statement.getColumnName()) + " " + database.getColumnType(statement.getColumnDataType(), false) + " DEFAULT " + database.convertJavaObjectToString(statement.getDefaultValue()) + ")",
                        new Column()
                                .setTable(new Table(statement.getTableName()).setSchema(statement.getSchemaName()))
                                .setName(statement.getColumnName()))
        };
    }
}