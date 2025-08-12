public class Account {
    private String accoutNumber;
    private String accountName;
    private int money;

    /**
     * Account 비기본 생성자 (계좌번호, 계좌주)
     * @param accountNumber
     * @param accountName
     */
    public Account(String accountNumber, String accountName) {
        this.accoutNumber = accountNumber;
        this.accountName = accountName;
        money = 0;
    }

    /**
     * Account 비기본 생성자 (계좌번호, 계좌주, 초기금액)
     * @param accountNumber
     * @param accountName
     * @param money
     */
    public Account(String accountNumber, String accountName, int money) {
        this.accoutNumber = accountNumber;
        this.accountName = accountName;
        this.money = money;
    }

    /**
     * m 을 금액에 더한다.
     * @param m
     */
    void addMoney(int m) {
        money+=m;
    }
    /**
     * m 을 금액에서 뺀다.
     * @param m
     */
    void subMoney(int m) {
        money-=m;
    }

    /**
     * 계좌번호 정보를 가져온다.
     * @return
     */
    public String getAccoutNumber() {
        return accoutNumber;
    }
    /**
     * 계좌번호 정보를 저장한다.
     * @param accoutNumber
     */
    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    /**
     * 계좌주 정보를 가져온다.
     * @return
     */
    public String getAccountName() {
        return accountName;
    }
    /**
     * 계좌주 정보를 저장한다.
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * 금액 정보를 가져온다.
     * @return
     */
    public int getMoney() {
        return money;
    }

    /**
     * 금액 정보를 저장한다.
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }
}
