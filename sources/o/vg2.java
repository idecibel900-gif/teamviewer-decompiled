package o;

/* JADX INFO: loaded from: classes.dex */
public enum vg2 implements i10 {
    ErrorType((byte) 0),
    SessionId((byte) 1),
    Directory((byte) 2),
    ListOfFiles((byte) 3),
    FileList((byte) 4),
    /* JADX INFO: Fake field, exist only in values array */
    LastError((byte) 5),
    /* JADX INFO: Fake field, exist only in values array */
    SessionACL((byte) 6),
    Message((byte) 7),
    NumberOfFiles((byte) 8),
    NumberOfBytes((byte) 9),
    /* JADX INFO: Fake field, exist only in values array */
    FileSumFinished((byte) 10),
    FilePath((byte) 11),
    Data((byte) 13),
    Size((byte) 15),
    Offset((byte) 16),
    SkipAllFiles((byte) 17),
    FileNumber((byte) 18),
    /* JADX INFO: Fake field, exist only in values array */
    IsDirectory((byte) 19),
    ResumeType((byte) 20),
    /* JADX INFO: Fake field, exist only in values array */
    IsDirectory((byte) 21),
    /* JADX INFO: Fake field, exist only in values array */
    NewPath((byte) 22),
    /* JADX INFO: Fake field, exist only in values array */
    IsDirectory((byte) 23),
    /* JADX INFO: Fake field, exist only in values array */
    NewPath((byte) 24),
    ServerPath((byte) 25),
    /* JADX INFO: Fake field, exist only in values array */
    NewPath((byte) 26),
    /* JADX INFO: Fake field, exist only in values array */
    IsDirectory((byte) 27),
    /* JADX INFO: Fake field, exist only in values array */
    NewPath((byte) 28),
    CRC((byte) 29),
    RevertItem((byte) 30),
    /* JADX INFO: Fake field, exist only in values array */
    IsDirectory((byte) 31),
    WriteTime((byte) 32);

    public final byte m;

    vg2(byte b) {
        this.m = b;
    }

    @Override // o.i10
    public final byte a() {
        return this.m;
    }
}
