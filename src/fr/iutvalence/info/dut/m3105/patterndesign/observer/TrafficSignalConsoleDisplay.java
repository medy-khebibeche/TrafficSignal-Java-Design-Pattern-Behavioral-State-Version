package fr.iutvalence.info.dut.m3105.patterndesign.observer;

public class TrafficSignalConsoleDisplay implements TrafficSignalObserver{

	@Override
	public void notifyTrafficSignalColor(TrafficSignalColor color) {
		switch(color)
		{
		case GREEN:
			System.out.println("Traffic signal state is Green");
			break;
		case ORANGE:
			System.out.println("Traffic signal state is Orange");
			break;
		case RED:
			System.out.println("Traffic signal state is Red");
			break;
		}
		
	}

	@Override
	public void notifyButtonPressed() {
		System.out.println("Button pressed !");
	}
	

}
