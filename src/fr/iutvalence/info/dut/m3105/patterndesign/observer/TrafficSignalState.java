package fr.iutvalence.info.dut.m3105.patterndesign.observer;


public abstract class TrafficSignalState
{
	protected final TrafficSignalContext context;
	protected int durationInSeconds;
	private final TrafficSignalColor name;
	
	public TrafficSignalState(TrafficSignalContext context, int durationInSeconds, TrafficSignalColor name)
	{
		super();
		this.context = context;
		this.durationInSeconds = durationInSeconds;
		this.name = name;
	}

	public void buttonPressed() 
	{
		System.out.println("button pressed!");
	}

	public void secondEllapsed() 
	{
		this.durationInSeconds--;
		System.out.println(this.durationInSeconds);
	}

	public TrafficSignalColor getName()
	{
		return this.name;
	}
}
