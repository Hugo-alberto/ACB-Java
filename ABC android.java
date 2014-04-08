public class Clientes {
	private int id;
	private String nombre;
	private String paterno;
	private String materno;
	private String email;
}

public Clientes(int id, String nombre, String paterno, String materno, String email){
	this.id=id;
	this.nombre=nombre;
	this.paterno= paterno;
	this.materno= materno;
	this.email= email;
}
// GETTERS/SETTERS
public String toString(){
	StringBuilder sb=new StringBuilder();
	sb.append("id").append(getId()).append("\n");
	sb.append("nombre").append(getNombre()).append("\n");
	sb.append("paterno").append(getNombre()).append("\n");
	sb.append("materno").append(getNombre()).append("\n");
	sb.append("email").append(getNombre()).append("\n");
	return sb.toString();
}
public class ManejadorDeBD extends SQLiteOpenHelper{
	private SQLiteDataBase db;
	public ManejadorDeBD(Context context){
		super(Context,"Clientes" ,null,1);
	}
	@Override
	public void onCreate(SQLiteDataBase db){
		db.execSQL("Create table Cliente(id integer primary key autoincremetn, nombre text, paterno text, materno text, email text)");

	}
	public void onUpgrade(SQLiteDataBase db, int oldVersion, int newVersion){
		db.execSQL("drop table if exist Cliente");
		onCreate(db);
	}
	public void ayudar(Cliente c){
		db=getWritableDatabase();
		db.execSQL("insert into Cliente values(null,'"+c.getNombre()+"','"+getPaterno()+"')")
	}