package liquibase.ext.ppa.addHistoryTrigger;

import liquibase.statement.SqlStatement;

public class AddHistoryTriggerStatement implements SqlStatement {
    private String tableNAme;

    public AddHistoryTriggerStatement(String tableNAme) {
        this.tableNAme = tableNAme;
    }

    public String getTableNAme() {
        return tableNAme;
    }

    public void setTableNAme(String tableNAme) {
        this.tableNAme = tableNAme;
    }

    @Override
    public boolean skipOnUnsupported() {
        return false;
    }

    @Override
    public boolean continueOnError() {
        return false;
    }
}
