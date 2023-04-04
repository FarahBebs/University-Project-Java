import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MembersManager {
    private ArrayList<EliteMember> eliteMembers;
    private ArrayList<GeneralMember> generalMembers;

    public MembersManager() {
        this.eliteMembers = new ArrayList<>();
        this.generalMembers = new ArrayList<>();
    }

    public void addEliteMember(String name, String surname, String email) {
        EliteMember eliteMember = new EliteMember(name, surname, email);
        this.eliteMembers.add(eliteMember);
        saveMembersToFile();
    }

    public void addGeneralMember(String name, String surname, String email) {
        GeneralMember generalMember = new GeneralMember(name, surname, email);
        this.generalMembers.add(generalMember);
        saveMembersToFile();
    }

    private void saveMembersToFile() {
        try {
            File file = new File("members.txt");
            FileWriter writer = new FileWriter(file, false); // Overwrite the file
            writer.write("#Elite Members\n");
            for (EliteMember eliteMember : eliteMembers) {
                writer.write(eliteMember.getName() + "\t\t" + eliteMember.getSurname() + "\t\t" + eliteMember.getEmail() + "\n");
            }
            writer.write("\n#General Members\n");
            for (GeneralMember generalMember : generalMembers) {
                writer.write(generalMember.getName() + "\t\t" + generalMember.getSurname() + "\t\t" + generalMember.getEmail() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMailToEliteMembers(String subject, String body) {
        for (EliteMember eliteMember : eliteMembers) {
            eliteMember.sendMail(subject, body);
        }
    }

    public void sendMailToGeneralMembers(String subject, String body) {
        for (GeneralMember generalMember : generalMembers) {
            generalMember.sendMail(subject, body);
        }
    }

    public void sendMailToAllMembers(String subject, String body) {
        sendMailToEliteMembers(subject, body);
        sendMailToGeneralMembers(subject, body);
    }
}
