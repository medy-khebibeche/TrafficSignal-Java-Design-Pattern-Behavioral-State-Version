package fr.iutvalence.info.dut.m3105.patterndesign.observer;


public class TrafficSignal extends Thread implements TrafficSignalContext, TrafficSignalButtonObserver
{
	private TrafficSignalState state;
	private TrafficSignalObserver trafficSignalObserver;

	@Override
	public void setTrafficSignalState(TrafficSignalState state)
	{
		trafficSignalObserver.notifyTrafficSignalColor(state.getName());
		this.state = state;		
	}

	@Override
	public void pressButton()
	{
		trafficSignalObserver.notifyButtonPressed();
		this.state.buttonPressed();
	}
	
	public void run()
	{
		this.setTrafficSignalState(new TrafficSignalGreenState(this));
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.state.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}


	
}
