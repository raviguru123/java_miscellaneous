public class RemoteControl {
	Command[] onCommand;
	Command[] offCommand;

	public RemoteControl() {
		onCommand = new Command[7];
		offCommand = new Command[7];
		NoCommand nocommand = new NoCommand();
		for(int i = 0 ; i < 7; i++) {
			onCommand[i] = nocommand;
			offCommand[i] = nocommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot]  = onCommand;
		this.offCommand[slot] = offCommand;
	} 

	public void pressOnButton(int slot) {
		this.onCommand[slot].execute();
	}

	public void pressOffButton(int slot) {
		this.offCommand[slot].execute();
	}
}