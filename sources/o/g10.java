package o;

/* JADX INFO: loaded from: classes.dex */
public enum g10 implements ph0 {
    CCUndefined((byte) 0),
    ControlCommand((byte) 1),
    SessionCommand((byte) 2),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyCommand((byte) 3),
    TVCommand((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    ServerCommand((byte) 5),
    MeetingCommand((byte) 6),
    /* JADX INFO: Fake field, exist only in values array */
    RouterCommand((byte) 7),
    /* JADX INFO: Fake field, exist only in values array */
    MeetingAuthenticationCommand((byte) 8),
    /* JADX INFO: Fake field, exist only in values array */
    CongestionControlCommand((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    MasterResponse((byte) 10),
    /* JADX INFO: Fake field, exist only in values array */
    RouterControlCommand((byte) 11),
    RemoteSupport((byte) 12),
    /* JADX INFO: Fake field, exist only in values array */
    WakeOnLanCommand((byte) 13),
    /* JADX INFO: Fake field, exist only in values array */
    ManagedDeviceCommand((byte) 14),
    /* JADX INFO: Fake field, exist only in values array */
    SecureNetworkCommand((byte) 15),
    /* JADX INFO: Fake field, exist only in values array */
    StructuredData((byte) 16),
    /* JADX INFO: Fake field, exist only in values array */
    StructuredDataInternal((byte) 17),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteManagementCommand((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    ProviderCommand((byte) 19),
    /* JADX INFO: Fake field, exist only in values array */
    AsyncMessageCommand((byte) 20),
    /* JADX INFO: Fake field, exist only in values array */
    InstantSupportCommand((byte) 21),
    /* JADX INFO: Fake field, exist only in values array */
    ProviderNotificationCommand((byte) 22),
    /* JADX INFO: Fake field, exist only in values array */
    RemoteSettingsCommand((byte) 23),
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED((byte) 24),
    /* JADX INFO: Fake field, exist only in values array */
    ChatCommand((byte) 25),
    /* JADX INFO: Fake field, exist only in values array */
    BuddyProviderCommand((byte) 26),
    /* JADX INFO: Fake field, exist only in values array */
    ScamBlockerCommand((byte) 27),
    /* JADX INFO: Fake field, exist only in values array */
    UNUSED_28((byte) 28),
    /* JADX INFO: Fake field, exist only in values array */
    LinuxCommand((byte) 29),
    /* JADX INFO: Fake field, exist only in values array */
    AvatarServiceCommand((byte) 30),
    /* JADX INFO: Fake field, exist only in values array */
    AccountStorageCommand((byte) 31),
    /* JADX INFO: Fake field, exist only in values array */
    ChatHistoryCommand((byte) 32),
    /* JADX INFO: Fake field, exist only in values array */
    InternalServicesCommand((byte) 33),
    /* JADX INFO: Fake field, exist only in values array */
    DiscoveryCommand((byte) 34),
    /* JADX INFO: Fake field, exist only in values array */
    StatisticsCommand((byte) 35),
    /* JADX INFO: Fake field, exist only in values array */
    MainConfigurationCommand((byte) 36),
    /* JADX INFO: Fake field, exist only in values array */
    ConfigurationCommand((byte) 37),
    /* JADX INFO: Fake field, exist only in values array */
    PushNotificationCommand((byte) 38),
    /* JADX INFO: Fake field, exist only in values array */
    LicenseCommand((byte) 39),
    /* JADX INFO: Fake field, exist only in values array */
    DataTransceiverCommand((byte) 40),
    /* JADX INFO: Fake field, exist only in values array */
    BackupCommand((byte) 41),
    /* JADX INFO: Fake field, exist only in values array */
    CustomModulesProviderCommand((byte) 42),
    /* JADX INFO: Fake field, exist only in values array */
    OEMApiCommand((byte) 43),
    /* JADX INFO: Fake field, exist only in values array */
    AbuseDetectionCommand((byte) 44),
    /* JADX INFO: Fake field, exist only in values array */
    SipPinCommand((byte) 45),
    /* JADX INFO: Fake field, exist only in values array */
    IdentityCommand((byte) 46),
    /* JADX INFO: Fake field, exist only in values array */
    LicenseMessagesCommand((byte) 47),
    /* JADX INFO: Fake field, exist only in values array */
    SessionReportsProviderCommand((byte) 48);

    public static final vv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final cj3 f844o;
    public final byte m;

    static {
        g10 g10Var = CCUndefined;
        n = new vv((byte) 2);
        f844o = new cj3(g10.class, g10Var);
    }

    g10(byte b) {
        this.m = b;
    }

    @Override // o.ph0
    public final byte a() {
        return this.m;
    }
}
