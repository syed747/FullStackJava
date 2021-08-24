package mod1.rev.day3;

public class JavaRivision4 {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.rp=new RedPaint();
		brush.rp=new BluePaint();
		
		BirthDayHall bdh=new BirthDayHall();
		bdh.bph=new BirthDayPartyHall();
		//bdh.bph=new MarriagePartyHall();
		
		GenericHall gh=new GenericHall();
		gh.ph=new BirthDayPartyHall();
		gh.ph=new MarriagePartyHall();
	}
}
class GenericHall{
	PartyHall ph;
}
class BirthDayHall{
	BirthDayPartyHall bph;
}
class PartyHall{
	
}
class BirthDayPartyHall extends PartyHall{
	
}
class MarriagePartyHall extends PartyHall{
	
}
class PaintBrush{
	Paint rp;
}
class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
