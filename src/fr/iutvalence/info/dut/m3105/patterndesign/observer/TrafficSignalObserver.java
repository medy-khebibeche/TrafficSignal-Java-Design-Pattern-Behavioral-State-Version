package fr.iutvalence.info.dut.m3105.patterndesign.observer;

public interface TrafficSignalObserver {

	public void notifyTrafficSignalColor(TrafficSignalColor color);
	public void notifyButtonPressed();
}
