
package hibernate.crud.operations;

import org.apache.logging.log4j.Logger;

import java.util.List;


    public class AppMain {

        public final static Logger logger = Logger.getLogger(AppMain.class);

        public static void main(String[] args) {

            logger.info(".......Hibernate Crud Operations TEST.......\n");

            logger.info("\n=======CREATE RECORDS=======\n");

            DbOperations.createRecord();

            logger.info("\n=======READ RECORDS=======\n");

            List viewUsers = DbOperations.displayRecords();
            if (viewUsers != null & viewUsers.size() > 0) {
                for (Object userObj : viewUsers ) {
                    logger.info(userObj.toString());
                    System.out.println(userObj);
                }
            }

            /*logger.info("\n=======UPDATE RECORDS=======\n");
            int updateId = 1;
            DbOperations.updateRecord(updateId);

            logger.info("\n=======READ RECORDS AFTER UPDATION=======\n");
            List updateUser = DbOperations.displayRecords();
            if(updateUser != null & updateUser.size() > 0) {
                for(Object userObj : updateUser) {
                    logger.info(userObj.toString());
                    System.out.println("UPDATED USER: " + userObj);
                }
            }
            logger.info("\n=======DELETE RECORD=======\n");
            int deleteId = 5;
            DbOperations.deleteRecord(deleteId);

            logger.info("\n=======READ RECORDS AFTER DELETION=======\n");
            List deleteUserRecord = DbOperations.displayRecords();
            for(Object userObj : deleteUserRecord) {
                logger.info(userObj.toString());
            }

            logger.info("\n=======DELETE ALL RECORDS=======\n");
            DbOperations.deleteAllRecords();
            logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
            List deleteAll = DbOperations.displayRecords();
            if(deleteAll.size() == 0) {
                logger.info("\nNo Records Are Present In The Database Table!\n");
            }*/
        }
    }


