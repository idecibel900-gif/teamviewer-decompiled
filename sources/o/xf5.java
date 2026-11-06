package o;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.incomingrcsharedlib.communication.SignedMessage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xf5 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ xf5(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        String strC = null;
        Intent intent = null;
        Account account = null;
        w41 w41Var = null;
        Intent intent2 = null;
        switch (this.a) {
            case 0:
                return new yf5(parcel.readInt());
            case 1:
                return new zf5(parcel.readLong());
            case 2:
                parcel.getClass();
                parcel.readInt();
                return hp5.q;
            case 3:
                parcel.getClass();
                parcel.readInt();
                return ip5.q;
            case 4:
                parcel.getClass();
                parcel.readInt();
                return jp5.q;
            case 5:
                return new fq5(parcel);
            case 6:
                return new sq5(parcel);
            case 7:
                return new kn6(parcel);
            case 8:
                return new SignedMessage(parcel);
            case ep1.b /* 9 */:
                j87 j87Var = new j87();
                j87Var.m = parcel.readInt();
                j87Var.n = parcel.readInt();
                j87Var.p = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    j87Var.f1138o = iArr;
                    parcel.readIntArray(iArr);
                }
                return j87Var;
            case ep1.c /* 10 */:
                k87 k87Var = new k87();
                k87Var.m = parcel.readInt();
                k87Var.n = parcel.readInt();
                int i2 = parcel.readInt();
                k87Var.f1238o = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    k87Var.p = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                k87Var.q = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    k87Var.r = iArr3;
                    parcel.readIntArray(iArr3);
                }
                k87Var.t = parcel.readInt() == 1;
                k87Var.u = parcel.readInt() == 1;
                k87Var.v = parcel.readInt() == 1;
                k87Var.s = parcel.readArrayList(j87.class.getClassLoader());
                return k87Var;
            case 11:
                return new dh7(parcel);
            case ep1.d /* 12 */:
                parcel.getClass();
                return new nk7(parcel);
            case 13:
                parcel.getClass();
                return (lk7) lk7.q.get(parcel.readInt());
            case 14:
                parcel.getClass();
                return (mk7) mk7.q.get(parcel.readInt());
            case 15:
                return new c48(parcel);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                parcel.getClass();
                return new dd8(parcel.readInt() == 0 ? null : hv.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : hv.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : hv.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : hv.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : hv.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? hv.CREATOR.createFromParcel(parcel) : null);
            case 17:
                int i4 = parcel.readInt();
                for (dg8 dg8Var : dg8.values()) {
                    if (i4 == dg8Var.m) {
                        return dg8Var;
                    }
                }
                return null;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                int iC0 = ct1.c0(parcel);
                while (true) {
                    ArrayList arrayListCreateTypedArrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iC0) {
                            ct1.E(parcel, iC0);
                            return new no7(iR4, arrayListCreateTypedArrayList);
                        }
                        int i5 = parcel.readInt();
                        char c = (char) i5;
                        if (c == 1) {
                            iR4 = ct1.R(parcel, i5);
                        } else if (c != 2) {
                            ct1.W(parcel, i5);
                        } else {
                            Parcelable.Creator<dr4> creator = dr4.CREATOR;
                            int iS = ct1.S(parcel, i5);
                            int iDataPosition = parcel.dataPosition();
                            if (iS == 0) {
                            }
                            arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(iDataPosition + iS);
                        }
                        break;
                    }
                }
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                int iC1 = ct1.c0(parcel);
                int iR5 = 0;
                while (parcel.dataPosition() < iC1) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        iR3 = ct1.R(parcel, i6);
                    } else if (c2 == 2) {
                        iR5 = ct1.R(parcel, i6);
                    } else if (c2 != 3) {
                        ct1.W(parcel, i6);
                    } else {
                        intent2 = (Intent) ct1.B(parcel, i6, Intent.CREATOR);
                    }
                }
                ct1.E(parcel, iC1);
                return new to8(iR3, iR5, intent2);
            case 20:
                int iC2 = ct1.c0(parcel);
                long j = 0;
                String strC2 = null;
                String strC3 = null;
                String strC4 = null;
                String strC5 = null;
                Uri uri = null;
                String strC6 = null;
                String strC7 = null;
                ArrayList arrayList = null;
                String strC8 = null;
                String strC9 = null;
                while (parcel.dataPosition() < iC2) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            strC2 = ct1.C(parcel, i7);
                            break;
                        case 3:
                            strC3 = ct1.C(parcel, i7);
                            break;
                        case 4:
                            strC4 = ct1.C(parcel, i7);
                            break;
                        case 5:
                            strC5 = ct1.C(parcel, i7);
                            break;
                        case 6:
                            uri = (Uri) ct1.B(parcel, i7, Uri.CREATOR);
                            break;
                        case 7:
                            strC6 = ct1.C(parcel, i7);
                            break;
                        case '\b':
                            ct1.e0(parcel, i7, 8);
                            j = parcel.readLong();
                            break;
                        case ep1.b /* 9 */:
                            strC7 = ct1.C(parcel, i7);
                            break;
                        case ep1.c /* 10 */:
                            Parcelable.Creator<Scope> creator2 = Scope.CREATOR;
                            int iS2 = ct1.S(parcel, i7);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iS2 == 0) {
                                arrayList = null;
                            } else {
                                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(creator2);
                                parcel.setDataPosition(iDataPosition2 + iS2);
                                arrayList = arrayListCreateTypedArrayList2;
                            }
                            break;
                        case 11:
                            strC8 = ct1.C(parcel, i7);
                            break;
                        case ep1.d /* 12 */:
                            strC9 = ct1.C(parcel, i7);
                            break;
                        default:
                            ct1.W(parcel, i7);
                            break;
                    }
                }
                ct1.E(parcel, iC2);
                return new GoogleSignInAccount(strC2, strC3, strC4, strC5, uri, strC6, j, strC7, arrayList, strC8, strC9);
            case 21:
                int iC3 = ct1.c0(parcel);
                long j2 = 0;
                int iR6 = 0;
                int iR7 = 0;
                boolean zP = false;
                String strC10 = null;
                while (parcel.dataPosition() < iC3) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iR6 = ct1.R(parcel, i8);
                    } else if (c3 == 2) {
                        strC10 = ct1.C(parcel, i8);
                    } else if (c3 == 3) {
                        ct1.e0(parcel, i8, 8);
                        j2 = parcel.readLong();
                    } else if (c3 == 4) {
                        iR7 = ct1.R(parcel, i8);
                    } else if (c3 != 5) {
                        ct1.W(parcel, i8);
                    } else {
                        zP = ct1.P(parcel, i8);
                    }
                }
                ct1.E(parcel, iC3);
                return new wo8(iR6, strC10, j2, iR7, zP);
            case 22:
                int iC4 = ct1.c0(parcel);
                ArrayList<String> arrayList2 = null;
                String strC11 = null;
                while (parcel.dataPosition() < iC4) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        int iS3 = ct1.S(parcel, i9);
                        int iDataPosition3 = parcel.dataPosition();
                        if (iS3 == 0) {
                            arrayList2 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition3 + iS3);
                            arrayList2 = arrayListCreateStringArrayList;
                        }
                    } else if (c4 != 2) {
                        ct1.W(parcel, i9);
                    } else {
                        strC11 = ct1.C(parcel, i9);
                    }
                }
                ct1.E(parcel, iC4);
                return new op8(strC11, arrayList2);
            case 23:
                int iC5 = ct1.c0(parcel);
                bq8 bq8Var = null;
                while (parcel.dataPosition() < iC5) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        iR2 = ct1.R(parcel, i10);
                    } else if (c5 == 2) {
                        w41Var = (w41) ct1.B(parcel, i10, w41.CREATOR);
                    } else if (c5 != 3) {
                        ct1.W(parcel, i10);
                    } else {
                        bq8Var = (bq8) ct1.B(parcel, i10, bq8.CREATOR);
                    }
                }
                ct1.E(parcel, iC5);
                return new wp8(iR2, w41Var, bq8Var);
            case 24:
                int iC6 = ct1.c0(parcel);
                long j3 = 0;
                long j4 = 0;
                int iR8 = -1;
                int iR9 = 0;
                int iR10 = 0;
                int iR11 = 0;
                int iR12 = 0;
                String strC12 = null;
                String strC13 = null;
                while (parcel.dataPosition() < iC6) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iR9 = ct1.R(parcel, i11);
                            break;
                        case 2:
                            iR10 = ct1.R(parcel, i11);
                            break;
                        case 3:
                            iR11 = ct1.R(parcel, i11);
                            break;
                        case 4:
                            ct1.e0(parcel, i11, 8);
                            j3 = parcel.readLong();
                            break;
                        case 5:
                            ct1.e0(parcel, i11, 8);
                            j4 = parcel.readLong();
                            break;
                        case 6:
                            strC12 = ct1.C(parcel, i11);
                            break;
                        case 7:
                            strC13 = ct1.C(parcel, i11);
                            break;
                        case '\b':
                            iR12 = ct1.R(parcel, i11);
                            break;
                        case ep1.b /* 9 */:
                            iR8 = ct1.R(parcel, i11);
                            break;
                        default:
                            ct1.W(parcel, i11);
                            break;
                    }
                }
                ct1.E(parcel, iC6);
                return new dr4(iR9, iR10, iR11, j3, j4, strC12, strC13, iR12, iR8);
            case 25:
                int iC7 = ct1.c0(parcel);
                int iR13 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iC7) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        iR = ct1.R(parcel, i12);
                    } else if (c6 == 2) {
                        account = (Account) ct1.B(parcel, i12, Account.CREATOR);
                    } else if (c6 == 3) {
                        iR13 = ct1.R(parcel, i12);
                    } else if (c6 != 4) {
                        ct1.W(parcel, i12);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) ct1.B(parcel, i12, GoogleSignInAccount.CREATOR);
                    }
                }
                ct1.E(parcel, iC7);
                return new aq8(iR, account, iR13, googleSignInAccount);
            case 26:
                int iC8 = ct1.c0(parcel);
                int iR14 = 0;
                boolean zP2 = false;
                boolean zP3 = false;
                IBinder iBinder = null;
                w41 w41Var2 = null;
                while (parcel.dataPosition() < iC8) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        iR14 = ct1.R(parcel, i13);
                    } else if (c7 == 2) {
                        int iS4 = ct1.S(parcel, i13);
                        int iDataPosition4 = parcel.dataPosition();
                        if (iS4 == 0) {
                            iBinder = null;
                        } else {
                            IBinder strongBinder = parcel.readStrongBinder();
                            parcel.setDataPosition(iDataPosition4 + iS4);
                            iBinder = strongBinder;
                        }
                    } else if (c7 == 3) {
                        w41Var2 = (w41) ct1.B(parcel, i13, w41.CREATOR);
                    } else if (c7 == 4) {
                        zP2 = ct1.P(parcel, i13);
                    } else if (c7 != 5) {
                        ct1.W(parcel, i13);
                    } else {
                        zP3 = ct1.P(parcel, i13);
                    }
                }
                ct1.E(parcel, iC8);
                return new bq8(iR14, iBinder, w41Var2, zP2, zP3);
            case 27:
                int iC9 = ct1.c0(parcel);
                while (parcel.dataPosition() < iC9) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        ct1.W(parcel, i14);
                    } else {
                        intent = (Intent) ct1.B(parcel, i14, Intent.CREATOR);
                    }
                }
                ct1.E(parcel, iC9);
                return new ku0(intent);
            case 28:
                int iC10 = ct1.c0(parcel);
                int iR15 = 0;
                int iR16 = 0;
                PendingIntent pendingIntent = null;
                String strC14 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iC10) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        iR15 = ct1.R(parcel, i15);
                    } else if (c8 == 2) {
                        iR16 = ct1.R(parcel, i15);
                    } else if (c8 == 3) {
                        pendingIntent = (PendingIntent) ct1.B(parcel, i15, PendingIntent.CREATOR);
                    } else if (c8 == 4) {
                        strC14 = ct1.C(parcel, i15);
                    } else if (c8 != 5) {
                        ct1.W(parcel, i15);
                    } else {
                        int iS5 = ct1.S(parcel, i15);
                        if (iS5 == 0) {
                            numValueOf = null;
                        } else {
                            if (iS5 != 4) {
                                String hexString = Integer.toHexString(iS5);
                                StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + String.valueOf(4).length() + 19 + String.valueOf(iS5).length() + 4 + 1);
                                sb.append("Expected size 4 got ");
                                sb.append(iS5);
                                sb.append(" (0x");
                                sb.append(hexString);
                                sb.append(")");
                                throw new fh6(sb.toString(), parcel);
                            }
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                ct1.E(parcel, iC10);
                return new w41(iR15, iR16, pendingIntent, strC14, numValueOf);
            default:
                int iC11 = ct1.c0(parcel);
                String strC15 = null;
                String strC16 = null;
                String strC17 = null;
                while (parcel.dataPosition() < iC11) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        strC = ct1.C(parcel, i16);
                    } else if (c9 == 2) {
                        strC15 = ct1.C(parcel, i16);
                    } else if (c9 == 3) {
                        strC16 = ct1.C(parcel, i16);
                    } else if (c9 != 4) {
                        ct1.W(parcel, i16);
                    } else {
                        strC17 = ct1.C(parcel, i16);
                    }
                }
                ct1.E(parcel, iC11);
                return new x88(strC, strC15, strC16, strC17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new yf5[i];
            case 1:
                return new zf5[i];
            case 2:
                return new hp5[i];
            case 3:
                return new ip5[i];
            case 4:
                return new jp5[i];
            case 5:
                return new fq5[i];
            case 6:
                return new sq5[i];
            case 7:
                return new kn6[i];
            case 8:
                return new SignedMessage[i];
            case ep1.b /* 9 */:
                return new j87[i];
            case ep1.c /* 10 */:
                return new k87[i];
            case 11:
                return new dh7[i];
            case ep1.d /* 12 */:
                return new nk7[i];
            case 13:
                return new lk7[i];
            case 14:
                return new mk7[i];
            case 15:
                return new c48[i];
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new dd8[i];
            case 17:
                return new dg8[i];
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new no7[i];
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new to8[i];
            case 20:
                return new GoogleSignInAccount[i];
            case 21:
                return new wo8[i];
            case 22:
                return new op8[i];
            case 23:
                return new wp8[i];
            case 24:
                return new dr4[i];
            case 25:
                return new aq8[i];
            case 26:
                return new bq8[i];
            case 27:
                return new ku0[i];
            case 28:
                return new w41[i];
            default:
                return new x88[i];
        }
    }
}
