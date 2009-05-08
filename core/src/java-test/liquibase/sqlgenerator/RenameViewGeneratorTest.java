package liquibase.sqlgenerator;

public class RenameViewGeneratorTest {
////    @Test
////    public void supports() throws Exception {
////        new DatabaseTestTemplate().testOnAllDatabases(new DatabaseTest() {
////            public void performTest(Database database) throws Exception {
////
////                if (database instanceof DerbyDatabase
////                        || database instanceof HsqlDatabase
////                        || database instanceof DB2Database
////                        || database instanceof CacheDatabase
////                        || database instanceof FirebirdDatabase) {
////                    assertFalse(createGeneratorUnderTest().supportsDatabase(database));
////                } else {
////                    assertTrue(createGeneratorUnderTest().supportsDatabase(database));
////                }
////            }
////        });
////    }
//
//    @Test
//    public void execute_defaultSchema() throws Exception {
//        new DatabaseTestTemplate().testOnAvailableDatabases(
//                new SqlStatementDatabaseTest(null, new RenameViewStatement(null, VIEW_NAME, NEW_VIEW_NAME)) {
//
//                    protected void preExecuteAssert(DatabaseSnapshot snapshot) {
//                        assertNotNull(snapshot.getView(VIEW_NAME));
//                        assertNull(snapshot.getView(NEW_VIEW_NAME));
//                    }
//
//                    @Override
//					protected boolean supportsTest(Database database) {
//                        return !(database instanceof SybaseASADatabase);
//					}
//
//					protected void postExecuteAssert(DatabaseSnapshot snapshot) {
//                        assertNull(snapshot.getView(VIEW_NAME));
//                        assertNotNull(snapshot.getView(NEW_VIEW_NAME));
//                    }
//
//                });
//    }
//
//    @Test
//    public void execute_altSchema() throws Exception {
//        new DatabaseTestTemplate().testOnAvailableDatabases(
//                new SqlStatementDatabaseTest(TestContext.ALT_SCHEMA, new RenameViewStatement(TestContext.ALT_SCHEMA, VIEW_NAME, NEW_VIEW_NAME)) {
//
//                	@Override
//					protected boolean supportsTest(Database database) {
//                        return !(database instanceof SybaseASADatabase);
//					}
//
//					protected boolean expectedException(Database database, JDBCException exception) {
//                        return database instanceof OracleDatabase || !database.supportsSchemas();
//                    }
//
//                    protected void preExecuteAssert(DatabaseSnapshot snapshot) {
//                        assertNotNull(snapshot.getView(VIEW_NAME));
//                        assertNull(snapshot.getView(NEW_VIEW_NAME));
//                    }
//
//                    protected void postExecuteAssert(DatabaseSnapshot snapshot) {
//                        assertNull(snapshot.getView(VIEW_NAME));
//                        assertNotNull(snapshot.getView(NEW_VIEW_NAME));
//                    }
//
//                });
//    }

}
