package liquibase.ext.ppa.addHistoryTrigger;

import liquibase.structure.AbstractDatabaseObject;
import liquibase.structure.DatabaseObject;
import liquibase.structure.core.Schema;
import liquibase.structure.core.Table;

public class Trigger extends AbstractDatabaseObject {

    public Trigger(){

    }
    public Trigger(String name, String tableCatalogName, String tableSchemaName, String tableName) {
        this();
        setName(name);
        if (tableName != null) {
            Table table = new Table(tableCatalogName, tableSchemaName, tableName);
            setTable(table);
        }
    }

    /**
     * Returns the Table object this PrimaryKey belongs to.
     *
     * @return the Table object, or null if not initialized yet.
     */
    public Table getTable() {
        return getAttribute("table", Table.class);
    }

    /**
     * Sets the Table object this PrimaryKey belongs to.
     *
     * @param table the table object to set as the container for this PrimaryKey
     * @return the updated object
     */
    public Trigger setTable(Table table) {
        this.setAttribute("table", table);
        return this;
    }

    @Override
    public DatabaseObject[] getContainingObjects() {
        return new DatabaseObject[] {
                getTable()
        };
    }

    @Override
    public String getName() {
        return getAttribute("name", String.class);
    }

    @Override
    public Trigger setName(String name) {
        this.setAttribute("name", name);
        return this;
    }

    @Override
    public Schema getSchema() {
        if (getTable() == null) {
            return null;
        }
        return getTable().getSchema();
    }
}
