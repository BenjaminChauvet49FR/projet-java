package parking.business;

public class Camion extends Vehicule
{
	private static final long serialVersionUID = -785294375487311300L;

	public Camion(String imm, String mod, String mar, String prop)
	{
		super(imm, mod, mar, prop);
	}

	public boolean isTransporteur()
	{
		return true;
	}

}
