
public class KodlamaioMain {

	public static void main(String[] args) {
		Kodlamaio kodlamaio = new Kodlamaio(1,"C#","ENG�N DEM�RO�");
		Kodlamaio kodlamaio1 = new Kodlamaio(1,"JAVA","ENG�N DEM�RO�");
		
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

