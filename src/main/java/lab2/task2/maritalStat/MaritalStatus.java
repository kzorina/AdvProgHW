package lab2.task2.maritalStat;

/**
 * Created by zorka_000 on 11/6/2017.
 */
import lombok.Getter;

@Getter
public enum MaritalStatus {
    SINGLE(1,"холостой" ), MARRIED(2,"женат"), DIVORCED(3,"разведен"), WIDOW(4,"вдовец");

    private final int dbCode;
    private final String russianDesc;

    MaritalStatus(int dbCode, String russianDesc) {
        this.dbCode = dbCode;
        this.russianDesc = russianDesc;
    }

    public static MaritalStatus findByDbCode(int dbCode) {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new RuntimeException(dbCode + " not supported");
    }


    @Override
    public String toString() {
        return russianDesc.toUpperCase();
    }
}
