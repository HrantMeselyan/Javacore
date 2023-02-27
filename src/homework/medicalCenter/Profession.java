package homework.medicalCenter;

public enum Profession {
    FAMILY_PHYSICIANS("Family Physicians"),
    INTERNISTS("Internists"),
    EMERGENCY_PHYSICIANS("Emergency Physicians"),
    PSYCHIATRISTS("Psychiatrists");

    private String Profession;

    Profession(String profession) {
        this.Profession = profession;
    }

    Profession() {

    }

    public String getProfession() {
        return Profession;
    }
}
