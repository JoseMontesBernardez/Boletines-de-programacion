public class Boletin_21_2 {

    public static void main(String[] args) {

        int []notasAlum = new int [30];
        NotesProg obx = new NotesProg();

        notasAlum = NotesProg.createArrays(notasAlum);
        System.out.println("Estan aprobados");
        NotesProg.showApproved(notasAlum);
        System.out.println("Estan suspensos");
        NotesProg.showFails(notasAlum);
        NotesProg.showHighNote(notasAlum);
        NotesProg.avg(notasAlum);

    }
}
