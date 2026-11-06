package o;

import com.teamviewer.remotecontrollib.swig.INearbyDeviceItem;
import com.teamviewer.remotecontrollib.swig.INearbyDeviceItemSWIGJNI;
import com.teamviewer.remotecontrollib.swig.NearbyDevicesDyngateIds;
import com.teamviewer.swigcallbacklib.SignalCallbackFactory;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o15 {
    public final INearbyDeviceItem a;
    public final nw4 b;
    public String c;
    public String d;
    public final long e;
    public NearbyDevicesDyngateIds f;
    public bc3 g;
    public final cc3 h;
    public boolean i;
    public final BigInteger j;
    public final VoidSignalCallback k;

    /* JADX WARN: Code duplicated, block: B:10:0x0055  */
    /* JADX WARN: Code duplicated, block: B:15:0x008a A[LOOP:0: B:9:0x0053->B:15:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0051  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x0051, please report this as an issue */
    public o15(INearbyDeviceItem iNearbyDeviceItem, nw4 nw4Var) {
        int i;
        cc3 cc3Var;
        nw4Var.getClass();
        this.a = iNearbyDeviceItem;
        this.b = nw4Var;
        this.c = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetText(iNearbyDeviceItem.a, iNearbyDeviceItem);
        this.d = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetAccountPictureURL(iNearbyDeviceItem.a, iNearbyDeviceItem);
        this.e = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetAccountId(iNearbyDeviceItem.a, iNearbyDeviceItem);
        this.f = new NearbyDevicesDyngateIds(INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetDyngateIds(iNearbyDeviceItem.a, iNearbyDeviceItem));
        this.g = iNearbyDeviceItem.a();
        int iINearbyDeviceItem_GetItemType = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetItemType(iNearbyDeviceItem.a, iNearbyDeviceItem);
        cc3 cc3Var2 = cc3.Undefined;
        cc3[] cc3VarArr = (cc3[]) cc3.class.getEnumConstants();
        if (iINearbyDeviceItem_GetItemType >= cc3VarArr.length || iINearbyDeviceItem_GetItemType < 0) {
            for (cc3 cc3Var3 : cc3VarArr) {
                if (cc3Var3.m == iINearbyDeviceItem_GetItemType) {
                    cc3Var = cc3Var3;
                }
            }
            hk0.g(ua5.k(iINearbyDeviceItem_GetItemType, cc3.class, "No enum ", " with value "));
            throw null;
        }
        cc3Var = cc3VarArr[iINearbyDeviceItem_GetItemType];
        if (cc3Var.m != iINearbyDeviceItem_GetItemType) {
            while (i < r1) {
                if (cc3Var3.m == iINearbyDeviceItem_GetItemType) {
                    cc3Var = cc3Var3;
                }
            }
            hk0.g(ua5.k(iINearbyDeviceItem_GetItemType, cc3.class, "No enum ", " with value "));
            throw null;
        }
        this.h = cc3Var;
        this.i = true;
        INearbyDeviceItem iNearbyDeviceItem2 = this.a;
        this.j = INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetItemId(iNearbyDeviceItem2.a, iNearbyDeviceItem2);
        VoidSignalCallback voidSignalCallback = SignalCallbackFactory.INSTANCE.getInstance().voidSignalCallback(new vm3(this, (byte) 15));
        this.k = voidSignalCallback;
        INearbyDeviceItem iNearbyDeviceItem3 = this.a;
        INearbyDeviceItemSWIGJNI.INearbyDeviceItem_RegisterOnPropertiesChangedCallback(iNearbyDeviceItem3.a, iNearbyDeviceItem3, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public final boolean a() {
        List<vd5> list;
        INearbyDeviceItem iNearbyDeviceItem = this.a;
        if (!im3.n(INearbyDeviceItemSWIGJNI.INearbyDeviceItem_GetParentId(iNearbyDeviceItem.a, iNearbyDeviceItem), BigInteger.ZERO) || (list = (List) this.b.getValue()) == null) {
            return false;
        }
        for (vd5 vd5Var : list) {
            BigInteger bigInteger = ((o15) vd5Var.m).j;
            bigInteger.getClass();
            if (bigInteger.equals(this.j) && ((List) vd5Var.n).isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
