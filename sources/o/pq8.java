package o;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class pq8 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ pq8(byte b) {
        this.a = b;
    }

    public static void a(bz2 bz2Var, Parcel parcel, int i) {
        int iB0 = et1.b0(parcel, 20293);
        int i2 = bz2Var.m;
        et1.a0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = bz2Var.n;
        et1.a0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = bz2Var.f469o;
        et1.a0(parcel, 3, 4);
        parcel.writeInt(i4);
        et1.X(parcel, 4, bz2Var.p);
        IBinder iBinder = bz2Var.q;
        if (iBinder != null) {
            int iB1 = et1.b0(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            et1.c0(parcel, iB1);
        }
        et1.Y(parcel, 6, bz2Var.r, i);
        et1.V(parcel, 7, bz2Var.s);
        et1.W(parcel, 8, bz2Var.t, i);
        et1.Y(parcel, 10, bz2Var.u, i);
        et1.Y(parcel, 11, bz2Var.v, i);
        boolean z = bz2Var.w;
        et1.a0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = bz2Var.x;
        et1.a0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = bz2Var.y;
        et1.a0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        et1.X(parcel, 15, bz2Var.z);
        et1.c0(parcel, iB0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String strC = null;
        Bundle bundleZ = null;
        String strC2 = null;
        int iR = 0;
        switch (this.a) {
            case 0:
                int iC0 = ct1.c0(parcel);
                int iR2 = 0;
                boolean zP = false;
                boolean zP2 = false;
                int iR3 = 0;
                int iR4 = 0;
                while (parcel.dataPosition() < iC0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iR2 = ct1.R(parcel, i);
                    } else if (c == 2) {
                        zP = ct1.P(parcel, i);
                    } else if (c == 3) {
                        zP2 = ct1.P(parcel, i);
                    } else if (c == 4) {
                        iR3 = ct1.R(parcel, i);
                    } else if (c != 5) {
                        ct1.W(parcel, i);
                    } else {
                        iR4 = ct1.R(parcel, i);
                    }
                }
                ct1.E(parcel, iC0);
                return new ef6(iR2, zP, zP2, iR3, iR4);
            case 1:
                int iC1 = ct1.c0(parcel);
                String strC3 = null;
                int iR5 = 0;
                boolean zP3 = false;
                long j = -1;
                while (parcel.dataPosition() < iC1) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        strC3 = ct1.C(parcel, i2);
                    } else if (c2 == 2) {
                        iR5 = ct1.R(parcel, i2);
                    } else if (c2 == 3) {
                        ct1.e0(parcel, i2, 8);
                        j = parcel.readLong();
                    } else if (c2 != 4) {
                        ct1.W(parcel, i2);
                    } else {
                        zP3 = ct1.P(parcel, i2);
                    }
                }
                ct1.E(parcel, iC1);
                return new bi2(strC3, iR5, j, zP3);
            case 2:
                return new fq8((PendingIntent) parcel.readParcelable(od6.class.getClassLoader()), parcel.readInt() != 0);
            case 3:
                return new dt8(parcel.readStrongBinder());
            case 4:
                int iC2 = ct1.c0(parcel);
                boolean zP4 = true;
                int iR6 = 0;
                int iR7 = 0;
                while (parcel.dataPosition() < iC2) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iR = ct1.R(parcel, i3);
                    } else if (c3 == 2) {
                        iR6 = ct1.R(parcel, i3);
                    } else if (c3 == 3) {
                        iR7 = ct1.R(parcel, i3);
                    } else if (c3 != 4) {
                        ct1.W(parcel, i3);
                    } else {
                        zP4 = ct1.P(parcel, i3);
                    }
                }
                ct1.E(parcel, iC2);
                return new zx0(iR, iR6, iR7, zP4);
            case 5:
                int iC3 = ct1.c0(parcel);
                while (parcel.dataPosition() < iC3) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        iR = ct1.R(parcel, i4);
                    } else if (c4 != 2) {
                        ct1.W(parcel, i4);
                    } else {
                        strC = ct1.C(parcel, i4);
                    }
                }
                ct1.E(parcel, iC3);
                return new Scope(iR, strC);
            case 6:
                int iC4 = ct1.c0(parcel);
                w41 w41Var = null;
                int iR8 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iC4) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 1) {
                        iR8 = ct1.R(parcel, i5);
                    } else if (c5 == 2) {
                        strC2 = ct1.C(parcel, i5);
                    } else if (c5 == 3) {
                        pendingIntent = (PendingIntent) ct1.B(parcel, i5, PendingIntent.CREATOR);
                    } else if (c5 != 4) {
                        ct1.W(parcel, i5);
                    } else {
                        w41Var = (w41) ct1.B(parcel, i5, w41.CREATOR);
                    }
                }
                ct1.E(parcel, iC4);
                return new Status(iR8, strC2, pendingIntent, w41Var);
            case 7:
                int iC5 = ct1.c0(parcel);
                a51 a51Var = null;
                int iR9 = 0;
                bi2[] bi2VarArr = null;
                while (parcel.dataPosition() < iC5) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        bundleZ = ct1.z(parcel, i6);
                    } else if (c6 == 2) {
                        bi2VarArr = (bi2[]) ct1.D(parcel, i6, bi2.CREATOR);
                    } else if (c6 == 3) {
                        iR9 = ct1.R(parcel, i6);
                    } else if (c6 != 4) {
                        ct1.W(parcel, i6);
                    } else {
                        a51Var = (a51) ct1.B(parcel, i6, a51.CREATOR);
                    }
                }
                ct1.E(parcel, iC5);
                xv8 xv8Var = new xv8();
                xv8Var.m = bundleZ;
                xv8Var.n = bi2VarArr;
                xv8Var.f2555o = iR9;
                xv8Var.p = a51Var;
                return xv8Var;
            case 8:
                int iC6 = ct1.c0(parcel);
                ef6 ef6Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zP5 = false;
                boolean zP6 = false;
                int iR10 = 0;
                while (parcel.dataPosition() < iC6) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            ef6Var = (ef6) ct1.B(parcel, i7, ef6.CREATOR);
                            break;
                        case 2:
                            zP5 = ct1.P(parcel, i7);
                            break;
                        case 3:
                            zP6 = ct1.P(parcel, i7);
                            break;
                        case 4:
                            int iS = ct1.S(parcel, i7);
                            int iDataPosition = parcel.dataPosition();
                            if (iS != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iS);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iR10 = ct1.R(parcel, i7);
                            break;
                        case 6:
                            int iS2 = ct1.S(parcel, i7);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iS2 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iS2);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            ct1.W(parcel, i7);
                            break;
                    }
                }
                ct1.E(parcel, iC6);
                return new a51(ef6Var, zP5, zP6, iArr, iR10, iArr2);
            case ep1.b /* 9 */:
                int iC7 = ct1.c0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = bz2.A;
                bi2[] bi2VarArr2 = bz2.B;
                bi2[] bi2VarArr3 = bi2VarArr2;
                String strC4 = null;
                IBinder iBinder = null;
                Account account = null;
                String strC5 = null;
                int iR11 = 0;
                int iR12 = 0;
                int iR13 = 0;
                boolean zP7 = false;
                int iR14 = 0;
                boolean zP8 = false;
                while (parcel.dataPosition() < iC7) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iR11 = ct1.R(parcel, i8);
                            break;
                        case 2:
                            iR12 = ct1.R(parcel, i8);
                            break;
                        case 3:
                            iR13 = ct1.R(parcel, i8);
                            break;
                        case 4:
                            strC4 = ct1.C(parcel, i8);
                            break;
                        case 5:
                            int iS3 = ct1.S(parcel, i8);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iS3 != 0) {
                                IBinder strongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(iDataPosition3 + iS3);
                                iBinder = strongBinder;
                            } else {
                                iBinder = null;
                            }
                            break;
                        case 6:
                            scopeArr = (Scope[]) ct1.D(parcel, i8, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = ct1.z(parcel, i8);
                            break;
                        case '\b':
                            account = (Account) ct1.B(parcel, i8, Account.CREATOR);
                            break;
                        case ep1.b /* 9 */:
                        default:
                            ct1.W(parcel, i8);
                            break;
                        case ep1.c /* 10 */:
                            bi2VarArr2 = (bi2[]) ct1.D(parcel, i8, bi2.CREATOR);
                            break;
                        case 11:
                            bi2VarArr3 = (bi2[]) ct1.D(parcel, i8, bi2.CREATOR);
                            break;
                        case ep1.d /* 12 */:
                            zP7 = ct1.P(parcel, i8);
                            break;
                        case '\r':
                            iR14 = ct1.R(parcel, i8);
                            break;
                        case 14:
                            zP8 = ct1.P(parcel, i8);
                            break;
                        case 15:
                            strC5 = ct1.C(parcel, i8);
                            break;
                    }
                }
                ct1.E(parcel, iC7);
                return new bz2(iR11, iR12, iR13, strC4, iBinder, scopeArr, bundle, account, bi2VarArr2, bi2VarArr3, zP7, iR14, zP8, strC5);
            default:
                int iC8 = ct1.c0(parcel);
                String strC6 = null;
                String strC7 = null;
                String strC8 = null;
                String strC9 = null;
                String strC10 = null;
                String strC11 = null;
                int iR15 = 0;
                while (parcel.dataPosition() < iC8) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            strC6 = ct1.C(parcel, i9);
                            break;
                        case 2:
                            strC7 = ct1.C(parcel, i9);
                            break;
                        case 3:
                            strC8 = ct1.C(parcel, i9);
                            break;
                        case 4:
                            strC9 = ct1.C(parcel, i9);
                            break;
                        case 5:
                            strC10 = ct1.C(parcel, i9);
                            break;
                        case 6:
                            iR15 = ct1.R(parcel, i9);
                            break;
                        case 7:
                            strC11 = ct1.C(parcel, i9);
                            break;
                        default:
                            ct1.W(parcel, i9);
                            break;
                    }
                }
                ct1.E(parcel, iC8);
                return new h96(iR15, strC6, strC7, strC8, strC9, strC10, strC11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ef6[i];
            case 1:
                return new bi2[i];
            case 2:
                return new od6[i];
            case 3:
                return new dt8[i];
            case 4:
                return new zx0[i];
            case 5:
                return new Scope[i];
            case 6:
                return new Status[i];
            case 7:
                return new xv8[i];
            case 8:
                return new a51[i];
            case ep1.b /* 9 */:
                return new bz2[i];
            default:
                return new h96[i];
        }
    }
}
