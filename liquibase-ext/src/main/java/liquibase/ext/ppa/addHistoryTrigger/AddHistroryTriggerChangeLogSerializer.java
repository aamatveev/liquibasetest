package liquibase.ext.ppa.addHistoryTrigger;

import liquibase.changelog.ChangeLogChild;
import liquibase.changelog.ChangeSet;
import liquibase.serializer.ChangeLogSerializer;
import liquibase.serializer.LiquibaseSerializable;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class AddHistroryTriggerChangeLogSerializer implements ChangeLogSerializer {
    @Override
    public <T extends ChangeLogChild> void write(List<T> children, OutputStream out) throws IOException {

    }

    @Override
    public void append(ChangeSet changeSet, File changeLogFile) throws IOException {

    }

    @Override
    public String[] getValidFileExtensions() {
        return new String[0];
    }

    @Override
    public String serialize(LiquibaseSerializable object, boolean pretty) {
        return null;
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
