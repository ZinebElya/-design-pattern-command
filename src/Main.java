public class Main {
    public static void main(String[] args) {
        Light kitchenLight = new Light();
        Command turnOnCommand = new TurnOnLightCommand(kitchenLight);
        Command turnOffCommand = new TurnOffLightCommand(kitchenLight);

        RemoteControl remoteControl = new RemoteControl();

        // Associate the commands to the remote control buttons
        remoteControl.setCommand(turnOnCommand); // will turn the light on
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand); //will turn the light off
        remoteControl.pressButton();

        remoteControl.undoButton();  // Undo the last action

        System.out.println("**************************************************");
        // add new command : open door:
        // 1. create a class Door
        // 2. create a class OpenDoorCommand

        Door garageDoor = new Door();
        Command openDoorCommand = new OpenDoorCommand(garageDoor);

        remoteControl.setCommand(openDoorCommand);
        remoteControl.pressButton();
        remoteControl.undoButton();
        /*
        This demonstrates how the Command pattern allows to easily add new commands
        to control different devices or perform various actions without modifying existing code.
         */
    }
}