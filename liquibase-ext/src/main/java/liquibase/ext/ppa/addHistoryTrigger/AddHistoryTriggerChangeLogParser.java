package liquibase.ext.ppa.addHistoryTrigger;

import liquibase.changelog.ChangeLogParameters;
import liquibase.changelog.DatabaseChangeLog;
import liquibase.exception.ChangeLogParseException;
import liquibase.parser.ChangeLogParser;
import liquibase.resource.ResourceAccessor;

public class AddHistoryTriggerChangeLogParser implements ChangeLogParser {
    @Override
    public DatabaseChangeLog parse(String physicalChangeLogLocation, ChangeLogParameters changeLogParameters, ResourceAccessor resourceAccessor) throws ChangeLogParseException {
        return null;
    }

    @Override
    public boolean supports(String changeLogFile, ResourceAccessor resourceAccessor) {
        return true;
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
