public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remotecontrol = new RemoteControl();

		Light light = new Light("Kitchen light");
		LightOnCommand  lightoncommand = new LightOnCommand(light);
		LightOffCommand lightoffcommand = new LightOffCommand(light);
		
		remotecontrol.setCommand(0, lightoncommand, lightoffcommand);

		remotecontrol.pressOnButton(0);
		remotecontrol.pressOffButton(0);
		remotecontrol.pressOnButton(0);

		remotecontrol.pressOffButton(1);
		remotecontrol.pressOnButton(1);
	}
}