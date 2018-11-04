public class Restaurant {
    private String name;
    private final int MAX_TABLES=2;
    private Table[] tables= new Table[MAX_TABLES];
    private int counter=0;

    public Restaurant(String name){
        this.name=name;
    }

    public void addTable(String name){
        if (counter==MAX_TABLES){
            System.out.println("No space");
            return;
        }
        Table table=new Table (name);
        tables [counter]=table;
        counter++;
    }

    public Table getTable(String name){
        for (int i=0; i<tables.length; i++){
            Table currentTable=tables[i];
            if (currentTable.getName().equals(name))
                return currentTable;

        }
        return null;
    }
    public void printTableOrders (String tableName){
        System.out.println("Print orders for " + tableName+"table");
        Table table=getTable(tableName);
        if (table==null){
            System.out.println("Table not exists");
            return;
        }
        table.printOrders();
    }
}
