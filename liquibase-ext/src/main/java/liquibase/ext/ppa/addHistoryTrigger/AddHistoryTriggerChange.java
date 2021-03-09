package liquibase.ext.ppa.addHistoryTrigger;

import liquibase.change.AbstractChange;
import liquibase.change.DatabaseChange;
import liquibase.database.Database;
import liquibase.statement.SqlStatement;

@DatabaseChange(
        name = "addHistoryTrigger",
        description = "Adds creates a trigger that save data to history table on update",
        priority = 1,
        appliesTo = {"table"}
)
public class AddHistoryTriggerChange extends AbstractChange {

    private String tableName;

    public String getTableName() {
        return tableName;
    }

    @Override
    public String getConfirmationMessage() {
        return "History trigger added to table " + this.getTableName();
    }

    @Override
    public SqlStatement[] generateStatements(Database database) {
        return new AddHistoryTriggerStatement[]{
                new AddHistoryTriggerStatement(getTableName())
        };
    }
}
