package liquibase.ext.ppa.addHistoryTrigger;

import liquibase.database.Database;
import liquibase.database.core.MSSQLDatabase;
import liquibase.exception.ValidationErrors;
import liquibase.exception.Warnings;
import liquibase.sql.Sql;
import liquibase.sql.UnparsedSql;
import liquibase.sqlgenerator.SqlGenerator;
import liquibase.sqlgenerator.SqlGeneratorChain;

public class AddHistoryTriggerGenerator implements SqlGenerator<AddHistoryTriggerStatement> {

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public boolean supports(AddHistoryTriggerStatement statement, Database database) {
        return database instanceof MSSQLDatabase;
    }

    @Override
    public boolean generateStatementsIsVolatile(Database database) {
        return false;
    }

    @Override
    public boolean generateRollbackStatementsIsVolatile(Database database) {
        return false;
    }

    @Override
    public ValidationErrors validate(AddHistoryTriggerStatement statement, Database database, SqlGeneratorChain<AddHistoryTriggerStatement> sqlGeneratorChain) {
        ValidationErrors validationErrors = new ValidationErrors();
        return validationErrors;
    }

    @Override
    public Warnings warn(AddHistoryTriggerStatement statementType, Database database, SqlGeneratorChain<AddHistoryTriggerStatement> sqlGeneratorChain) {
        return null;
    }

    @Override
    public Sql[] generateSql(AddHistoryTriggerStatement statement, Database database, SqlGeneratorChain<AddHistoryTriggerStatement> sqlGeneratorChain) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(
                "CREATE TRIGGER tr_asset_update\n" +
                        "    ON  [dbo].[asset]\n" +
                        "    AFTER UPDATE\n" +
                        "AS \n" +
                        "BEGIN\n" +
                        "    SET NOCOUNT ON;\n" +
                        "END");
        String sql = stringBuilder.toString();

        return new Sql[]{
                new UnparsedSql(sql)
        };
    }
}
