package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.versionedparcelable.ParcelImpl;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class dq8 implements Parcelable.Creator {
    public static final dq8 b = new dq8(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ dq8(byte b2) {
        this.a = b2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zP = false;
        switch (this.a) {
            case 0:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return hr.p;
                }
                int iC0 = ct1.c0(parcel);
                zx0 zx0Var = null;
                while (parcel.dataPosition() < iC0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        zx0Var = (zx0) ct1.B(parcel, i, zx0.CREATOR);
                    } else if (c != 2) {
                        ct1.W(parcel, i);
                    } else {
                        zP = ct1.P(parcel, i);
                    }
                }
                ct1.E(parcel, iC0);
                return new hr(zx0Var, zP);
            case 1:
                k7 k7Var = new k7();
                k7Var.m = parcel.readInt();
                return k7Var;
            case 2:
                parcel.getClass();
                return new z7(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 3:
                mt mtVar = new mt(parcel);
                mtVar.m = parcel.readByte() != 0;
                return mtVar;
            case 4:
                parcel.getClass();
                return new hv(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new x10(parcel);
            case 6:
                return new y10(parcel);
            case 7:
                n20 n20Var = new n20();
                n20Var.f1534o = 255;
                n20Var.p = -1;
                n20Var.m = parcel.readInt();
                n20Var.n = parcel.readInt();
                n20Var.f1534o = parcel.readInt();
                n20Var.p = parcel.readInt();
                n20Var.q = parcel.readInt();
                n20Var.r = parcel.readString();
                n20Var.s = parcel.readInt();
                n20Var.u = parcel.readInt();
                n20Var.w = parcel.readInt();
                n20Var.x = parcel.readInt();
                n20Var.y = parcel.readInt();
                n20Var.z = parcel.readInt();
                n20Var.v = parcel.readInt() != 0;
                return n20Var;
            case 8:
                parcel.getClass();
                ax0 ax0Var = new ax0();
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                ax0Var.m = string;
                String string2 = parcel.readString();
                if (string2 == null) {
                    string2 = "";
                }
                ax0Var.n = string2;
                String string3 = parcel.readString();
                if (string3 == null) {
                    string3 = "";
                }
                ax0Var.f370o = string3;
                String string4 = parcel.readString();
                if (string4 == null) {
                    string4 = "";
                }
                ax0Var.p = string4;
                String string5 = parcel.readString();
                if (string5 == null) {
                    string5 = "";
                }
                ax0Var.q = string5;
                String string6 = parcel.readString();
                ax0Var.r = string6 != null ? string6 : "";
                return ax0Var;
            case ep1.b /* 9 */:
                parcel.getClass();
                int i2 = parcel.readInt();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ContactOnlineStatus contactOnlineStatusValueOf = null;
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (parcel.readInt() != 0) {
                    contactOnlineStatusValueOf = ContactOnlineStatus.valueOf(parcel.readString());
                }
                return new h71(i2, numValueOf, string7, string8, string9, string10, contactOnlineStatusValueOf, b91.valueOf(parcel.readString()));
            case ep1.c /* 10 */:
                return new ok1(parcel.readInt());
            case 11:
                parcel.getClass();
                return new z02(parcel);
            case ep1.d /* 12 */:
                return new f82(parcel);
            case 13:
                pm2 pm2Var = new pm2(0, 0);
                pm2Var.m = 1;
                pm2Var.n = 0.0f;
                pm2Var.f1747o = 1.0f;
                pm2Var.p = -1;
                pm2Var.q = -1.0f;
                pm2Var.r = -1;
                pm2Var.s = -1;
                pm2Var.t = 16777215;
                pm2Var.u = 16777215;
                pm2Var.m = parcel.readInt();
                pm2Var.n = parcel.readFloat();
                pm2Var.f1747o = parcel.readFloat();
                pm2Var.p = parcel.readInt();
                pm2Var.q = parcel.readFloat();
                pm2Var.r = parcel.readInt();
                pm2Var.s = parcel.readInt();
                pm2Var.t = parcel.readInt();
                pm2Var.u = parcel.readInt();
                pm2Var.v = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) pm2Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) pm2Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) pm2Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) pm2Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) pm2Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) pm2Var).width = parcel.readInt();
                return pm2Var;
            case 14:
                rm2 rm2Var = new rm2(-2, -2);
                rm2Var.q = 0.0f;
                rm2Var.r = 1.0f;
                rm2Var.s = -1;
                rm2Var.t = -1.0f;
                rm2Var.w = 16777215;
                rm2Var.x = 16777215;
                rm2Var.q = parcel.readFloat();
                rm2Var.r = parcel.readFloat();
                rm2Var.s = parcel.readInt();
                rm2Var.t = parcel.readFloat();
                rm2Var.u = parcel.readInt();
                rm2Var.v = parcel.readInt();
                rm2Var.w = parcel.readInt();
                rm2Var.x = parcel.readInt();
                rm2Var.y = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) rm2Var).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) rm2Var).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) rm2Var).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) rm2Var).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) rm2Var).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) rm2Var).width = parcel.readInt();
                return rm2Var;
            case 15:
                tm2 tm2Var = new tm2();
                tm2Var.m = parcel.readInt();
                tm2Var.n = parcel.readInt();
                return tm2Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                nu2 nu2Var = new nu2();
                nu2Var.m = parcel.readString();
                nu2Var.n = parcel.readInt();
                return nu2Var;
            case 17:
                tu2 tu2Var = new tu2();
                tu2Var.q = null;
                tu2Var.r = new ArrayList();
                tu2Var.s = new ArrayList();
                tu2Var.m = parcel.createStringArrayList();
                tu2Var.n = parcel.createStringArrayList();
                tu2Var.f2144o = (x10[]) parcel.createTypedArray(x10.CREATOR);
                tu2Var.p = parcel.readInt();
                tu2Var.q = parcel.readString();
                tu2Var.r = parcel.createStringArrayList();
                tu2Var.s = parcel.createTypedArrayList(y10.CREATOR);
                tu2Var.t = parcel.createTypedArrayList(nu2.CREATOR);
                return tu2Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new zu2(parcel);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                parcel.getClass();
                return new h33(parcel.readInt());
            case 20:
                parcel.getClass();
                return new i33(parcel.readInt());
            case 21:
                parcel.getClass();
                return new j33((UUID) parcel.readSerializable());
            case 22:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new il3((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 23:
                z94 z94Var = new z94();
                z94Var.m = parcel.readInt();
                z94Var.n = parcel.readInt();
                z94Var.f2682o = parcel.readInt() == 1;
                return z94Var;
            case 24:
                return new bc4(parcel);
            case 25:
                return new av4(parcel);
            case 26:
                g05 g05Var = new g05();
                g05Var.m = parcel.readInt();
                g05Var.n = (cg5) parcel.readParcelable(g05.class.getClassLoader());
                return g05Var;
            case 27:
                e25 e25Var = new e25(parcel);
                e25Var.m = parcel.readInt();
                return e25Var;
            case 28:
                return new ParcelImpl(parcel);
            default:
                return new wf5(parcel.readFloat());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hr[i];
            case 1:
                return new k7[i];
            case 2:
                return new z7[i];
            case 3:
                return new mt[i];
            case 4:
                return new hv[i];
            case 5:
                return new x10[i];
            case 6:
                return new y10[i];
            case 7:
                return new n20[i];
            case 8:
                return new ax0[i];
            case ep1.b /* 9 */:
                return new h71[i];
            case ep1.c /* 10 */:
                return new ok1[i];
            case 11:
                return new z02[i];
            case ep1.d /* 12 */:
                return new f82[i];
            case 13:
                return new pm2[i];
            case 14:
                return new rm2[i];
            case 15:
                return new tm2[i];
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new nu2[i];
            case 17:
                return new tu2[i];
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new zu2[i];
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new h33[i];
            case 20:
                return new i33[i];
            case 21:
                return new j33[i];
            case 22:
                return new il3[i];
            case 23:
                return new z94[i];
            case 24:
                return new bc4[i];
            case 25:
                return new av4[i];
            case 26:
                return new g05[i];
            case 27:
                return new e25[i];
            case 28:
                return new ParcelImpl[i];
            default:
                return new wf5[i];
        }
    }
}
