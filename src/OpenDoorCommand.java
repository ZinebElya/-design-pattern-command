public class OpenDoorCommand implements Command {
    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();

    }

    @Override
    public void undo() {
        door.close();

    }
}
