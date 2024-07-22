package models.enums;

import java.util.Arrays;

public enum ProfileEnum {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_CUSTOMER("ROLE_CUSTOMER"),
    ROLE_TECHNICIAN("ROLE_TECHNICIAN");

    private final String desctiption;

    ProfileEnum(String desctiption) {
        this.desctiption = desctiption;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public static ProfileEnum toEnum(String desctiption) {
        return Arrays.stream(ProfileEnum.values())
                .filter(profileEnum -> profileEnum.getDesctiption().equals(desctiption))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid description: "+ desctiption) );
    }

}
