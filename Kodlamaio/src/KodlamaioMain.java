
public class KodlamaioMain {

	public static void main(String[] args) {
		Kodlamaio kodlamaio = new Kodlamaio(1,"C#","ENGÝN DEMÝROÐ");
		Kodlamaio kodlamaio1 = new Kodlamaio(1,"JAVA","ENGÝN DEMÝROÐ");
		
		Kodlamaio[] kodlamaios = {kodlamaio, kodlamaio1};
		for (Kodlamaio kodlamaio2 : kodlamaios)
		{
			
			System.out.println(kodlamaio2.CourseName);
			System.out.println(kodlamaio2.CourseTecher);
			
		}
		
		
	   KodlamaioManager kodlamaioManager = new KodlamaioManager();
	     
			kodlamaioManager.Record(kodlamaio);
			kodlamaioManager.ProgramRecord(kodlamaio);
		}
	}

