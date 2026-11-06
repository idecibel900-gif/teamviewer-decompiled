package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class k61 {
    public static final int[] c = {0, 4, 8};
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] b(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = ez5.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.y;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.y.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static f61 c(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        f61 f61Var = new f61();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? rz5.c : rz5.a);
        String[] strArr = di1.q;
        i61 i61Var = f61Var.b;
        j61 j61Var = f61Var.e;
        h61 h61Var = f61Var.c;
        g61 g61Var = f61Var.d;
        int[] iArr = c;
        SparseIntArray sparseIntArray = d;
        if (z) {
            e61 e61Var = new e61();
            e61Var.a = new int[10];
            e61Var.b = new int[10];
            e61Var.c = 0;
            e61Var.d = new int[10];
            e61Var.e = new float[10];
            e61Var.f = 0;
            e61Var.g = new int[5];
            e61Var.h = new String[5];
            e61Var.i = 0;
            e61Var.j = new int[4];
            e61Var.k = new boolean[4];
            e61Var.l = 0;
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (e.get(index)) {
                    case 2:
                        i2 = indexCount;
                        e61Var.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.I));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case ep1.b /* 9 */:
                    case ep1.c /* 10 */:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        io.sentry.android.core.v0.j("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        e61Var.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        e61Var.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, g61Var.C));
                        break;
                    case 7:
                        i2 = indexCount;
                        e61Var.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, g61Var.D));
                        break;
                    case 8:
                        i2 = indexCount;
                        e61Var.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.J));
                        break;
                    case 11:
                        i2 = indexCount;
                        e61Var.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.P));
                        break;
                    case ep1.d /* 12 */:
                        i2 = indexCount;
                        e61Var.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.Q));
                        break;
                    case 13:
                        i2 = indexCount;
                        e61Var.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.M));
                        break;
                    case 14:
                        i2 = indexCount;
                        e61Var.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.O));
                        break;
                    case 15:
                        i2 = indexCount;
                        e61Var.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.R));
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        i2 = indexCount;
                        e61Var.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.N));
                        break;
                    case 17:
                        i2 = indexCount;
                        e61Var.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, g61Var.d));
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        i2 = indexCount;
                        e61Var.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, g61Var.e));
                        break;
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        i2 = indexCount;
                        e61Var.a(19, typedArrayObtainStyledAttributes.getFloat(index, g61Var.f));
                        break;
                    case 20:
                        i2 = indexCount;
                        e61Var.a(20, typedArrayObtainStyledAttributes.getFloat(index, g61Var.w));
                        break;
                    case 21:
                        i2 = indexCount;
                        e61Var.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, g61Var.c));
                        break;
                    case 22:
                        i2 = indexCount;
                        e61Var.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, i61Var.a)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        e61Var.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, g61Var.b));
                        break;
                    case 24:
                        i2 = indexCount;
                        e61Var.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.F));
                        break;
                    case 27:
                        i2 = indexCount;
                        e61Var.b(27, typedArrayObtainStyledAttributes.getInt(index, g61Var.E));
                        break;
                    case 28:
                        i2 = indexCount;
                        e61Var.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.G));
                        break;
                    case 31:
                        i2 = indexCount;
                        e61Var.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.K));
                        break;
                    case 34:
                        i2 = indexCount;
                        e61Var.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.H));
                        break;
                    case 37:
                        i2 = indexCount;
                        e61Var.a(37, typedArrayObtainStyledAttributes.getFloat(index, g61Var.x));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, f61Var.a);
                        f61Var.a = resourceId;
                        e61Var.b(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        e61Var.a(39, typedArrayObtainStyledAttributes.getFloat(index, g61Var.U));
                        break;
                    case 40:
                        i2 = indexCount;
                        e61Var.a(40, typedArrayObtainStyledAttributes.getFloat(index, g61Var.T));
                        break;
                    case 41:
                        i2 = indexCount;
                        e61Var.b(41, typedArrayObtainStyledAttributes.getInt(index, g61Var.V));
                        break;
                    case 42:
                        i2 = indexCount;
                        e61Var.b(42, typedArrayObtainStyledAttributes.getInt(index, g61Var.W));
                        break;
                    case 43:
                        i2 = indexCount;
                        e61Var.a(43, typedArrayObtainStyledAttributes.getFloat(index, i61Var.c));
                        break;
                    case 44:
                        i2 = indexCount;
                        e61Var.d(44, true);
                        e61Var.a(44, typedArrayObtainStyledAttributes.getDimension(index, j61Var.m));
                        break;
                    case 45:
                        i2 = indexCount;
                        e61Var.a(45, typedArrayObtainStyledAttributes.getFloat(index, j61Var.b));
                        break;
                    case 46:
                        i2 = indexCount;
                        e61Var.a(46, typedArrayObtainStyledAttributes.getFloat(index, j61Var.c));
                        break;
                    case 47:
                        i2 = indexCount;
                        e61Var.a(47, typedArrayObtainStyledAttributes.getFloat(index, j61Var.d));
                        break;
                    case 48:
                        i2 = indexCount;
                        e61Var.a(48, typedArrayObtainStyledAttributes.getFloat(index, j61Var.e));
                        break;
                    case 49:
                        i2 = indexCount;
                        e61Var.a(49, typedArrayObtainStyledAttributes.getDimension(index, j61Var.f));
                        break;
                    case 50:
                        i2 = indexCount;
                        e61Var.a(50, typedArrayObtainStyledAttributes.getDimension(index, j61Var.g));
                        break;
                    case 51:
                        i2 = indexCount;
                        e61Var.a(51, typedArrayObtainStyledAttributes.getDimension(index, j61Var.i));
                        break;
                    case 52:
                        i2 = indexCount;
                        e61Var.a(52, typedArrayObtainStyledAttributes.getDimension(index, j61Var.j));
                        break;
                    case 53:
                        i2 = indexCount;
                        e61Var.a(53, typedArrayObtainStyledAttributes.getDimension(index, j61Var.k));
                        break;
                    case 54:
                        i2 = indexCount;
                        e61Var.b(54, typedArrayObtainStyledAttributes.getInt(index, g61Var.X));
                        break;
                    case 55:
                        i2 = indexCount;
                        e61Var.b(55, typedArrayObtainStyledAttributes.getInt(index, g61Var.Y));
                        break;
                    case 56:
                        i2 = indexCount;
                        e61Var.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.Z));
                        break;
                    case 57:
                        i2 = indexCount;
                        e61Var.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.a0));
                        break;
                    case 58:
                        i2 = indexCount;
                        e61Var.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.b0));
                        break;
                    case 59:
                        i2 = indexCount;
                        e61Var.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.c0));
                        break;
                    case 60:
                        i2 = indexCount;
                        e61Var.a(60, typedArrayObtainStyledAttributes.getFloat(index, j61Var.a));
                        break;
                    case 62:
                        i2 = indexCount;
                        e61Var.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.A));
                        break;
                    case 63:
                        i2 = indexCount;
                        e61Var.a(63, typedArrayObtainStyledAttributes.getFloat(index, g61Var.B));
                        break;
                    case 64:
                        i2 = indexCount;
                        e61Var.b(64, e(typedArrayObtainStyledAttributes, index, h61Var.a));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            e61Var.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            e61Var.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        e61Var.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        e61Var.a(67, typedArrayObtainStyledAttributes.getFloat(index, h61Var.e));
                        break;
                    case 68:
                        i2 = indexCount;
                        e61Var.a(68, typedArrayObtainStyledAttributes.getFloat(index, i61Var.d));
                        break;
                    case 69:
                        i2 = indexCount;
                        e61Var.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        e61Var.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        io.sentry.android.core.v0.c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        e61Var.b(72, typedArrayObtainStyledAttributes.getInt(index, g61Var.f0));
                        break;
                    case 73:
                        i2 = indexCount;
                        e61Var.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.g0));
                        break;
                    case 74:
                        i2 = indexCount;
                        e61Var.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        e61Var.d(75, typedArrayObtainStyledAttributes.getBoolean(index, g61Var.n0));
                        break;
                    case 76:
                        i2 = indexCount;
                        e61Var.b(76, typedArrayObtainStyledAttributes.getInt(index, h61Var.c));
                        break;
                    case 77:
                        i2 = indexCount;
                        e61Var.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        e61Var.b(78, typedArrayObtainStyledAttributes.getInt(index, i61Var.b));
                        break;
                    case 79:
                        i2 = indexCount;
                        e61Var.a(79, typedArrayObtainStyledAttributes.getFloat(index, h61Var.d));
                        break;
                    case 80:
                        i2 = indexCount;
                        e61Var.d(80, typedArrayObtainStyledAttributes.getBoolean(index, g61Var.l0));
                        break;
                    case 81:
                        i2 = indexCount;
                        e61Var.d(81, typedArrayObtainStyledAttributes.getBoolean(index, g61Var.m0));
                        break;
                    case 82:
                        i2 = indexCount;
                        e61Var.b(82, typedArrayObtainStyledAttributes.getInteger(index, h61Var.b));
                        break;
                    case 83:
                        i2 = indexCount;
                        e61Var.b(83, e(typedArrayObtainStyledAttributes, index, j61Var.h));
                        break;
                    case 84:
                        i2 = indexCount;
                        e61Var.b(84, typedArrayObtainStyledAttributes.getInteger(index, h61Var.g));
                        break;
                    case 85:
                        i2 = indexCount;
                        e61Var.a(85, typedArrayObtainStyledAttributes.getFloat(index, h61Var.f));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            h61Var.i = resourceId2;
                            e61Var.b(89, resourceId2);
                            if (h61Var.i != -1) {
                                e61Var.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            h61Var.h = string;
                            e61Var.c(90, string);
                            if (h61Var.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                h61Var.i = resourceId3;
                                e61Var.b(89, resourceId3);
                                e61Var.b(88, -2);
                            } else {
                                e61Var.b(88, -1);
                            }
                        } else {
                            e61Var.b(88, typedArrayObtainStyledAttributes.getInteger(index, h61Var.i));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        io.sentry.android.core.v0.j("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        e61Var.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.L));
                        break;
                    case 94:
                        i2 = indexCount;
                        e61Var.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, g61Var.S));
                        break;
                    case 95:
                        i2 = indexCount;
                        f(e61Var, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        f(e61Var, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        e61Var.b(97, typedArrayObtainStyledAttributes.getInt(index, g61Var.o0));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = au4.C;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            f61Var.a = typedArrayObtainStyledAttributes.getResourceId(index, f61Var.a);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        e61Var.d(99, typedArrayObtainStyledAttributes.getBoolean(index, g61Var.g));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        g61Var.p = e(typedArrayObtainStyledAttributes, index2, g61Var.p);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        g61Var.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.I);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        g61Var.f865o = e(typedArrayObtainStyledAttributes, index2, g61Var.f865o);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        g61Var.n = e(typedArrayObtainStyledAttributes, index2, g61Var.n);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        g61Var.y = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        g61Var.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, g61Var.C);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        g61Var.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, g61Var.D);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        g61Var.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.J);
                        continue;
                        i7++;
                        break;
                    case ep1.b /* 9 */:
                        i = indexCount2;
                        g61Var.v = e(typedArrayObtainStyledAttributes, index2, g61Var.v);
                        continue;
                        i7++;
                        break;
                    case ep1.c /* 10 */:
                        i = indexCount2;
                        g61Var.u = e(typedArrayObtainStyledAttributes, index2, g61Var.u);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        g61Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.P);
                        continue;
                        i7++;
                        break;
                    case ep1.d /* 12 */:
                        i = indexCount2;
                        g61Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.Q);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        g61Var.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.M);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        g61Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.O);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        g61Var.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.R);
                        continue;
                        i7++;
                        break;
                    case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                        i = indexCount2;
                        g61Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.N);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        g61Var.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, g61Var.d);
                        continue;
                        i7++;
                        break;
                    case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                        i = indexCount2;
                        g61Var.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, g61Var.e);
                        continue;
                        i7++;
                        break;
                    case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        i = indexCount2;
                        g61Var.f = typedArrayObtainStyledAttributes.getFloat(index2, g61Var.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        g61Var.w = typedArrayObtainStyledAttributes.getFloat(index2, g61Var.w);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        g61Var.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, g61Var.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, i61Var.a);
                        i61Var.a = i8;
                        i61Var.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        g61Var.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, g61Var.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        g61Var.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.F);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        g61Var.h = e(typedArrayObtainStyledAttributes, index2, g61Var.h);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        g61Var.i = e(typedArrayObtainStyledAttributes, index2, g61Var.i);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        g61Var.E = typedArrayObtainStyledAttributes.getInt(index2, g61Var.E);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        g61Var.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.G);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        g61Var.j = e(typedArrayObtainStyledAttributes, index2, g61Var.j);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        g61Var.k = e(typedArrayObtainStyledAttributes, index2, g61Var.k);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        g61Var.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.K);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        g61Var.s = e(typedArrayObtainStyledAttributes, index2, g61Var.s);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        g61Var.t = e(typedArrayObtainStyledAttributes, index2, g61Var.t);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        g61Var.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.H);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        g61Var.m = e(typedArrayObtainStyledAttributes, index2, g61Var.m);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        g61Var.l = e(typedArrayObtainStyledAttributes, index2, g61Var.l);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        g61Var.x = typedArrayObtainStyledAttributes.getFloat(index2, g61Var.x);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        f61Var.a = typedArrayObtainStyledAttributes.getResourceId(index2, f61Var.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        g61Var.U = typedArrayObtainStyledAttributes.getFloat(index2, g61Var.U);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        g61Var.T = typedArrayObtainStyledAttributes.getFloat(index2, g61Var.T);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        g61Var.V = typedArrayObtainStyledAttributes.getInt(index2, g61Var.V);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        g61Var.W = typedArrayObtainStyledAttributes.getInt(index2, g61Var.W);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        i61Var.c = typedArrayObtainStyledAttributes.getFloat(index2, i61Var.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        j61Var.l = true;
                        j61Var.m = typedArrayObtainStyledAttributes.getDimension(index2, j61Var.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        j61Var.b = typedArrayObtainStyledAttributes.getFloat(index2, j61Var.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        j61Var.c = typedArrayObtainStyledAttributes.getFloat(index2, j61Var.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        j61Var.d = typedArrayObtainStyledAttributes.getFloat(index2, j61Var.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        j61Var.e = typedArrayObtainStyledAttributes.getFloat(index2, j61Var.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        j61Var.f = typedArrayObtainStyledAttributes.getDimension(index2, j61Var.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        j61Var.g = typedArrayObtainStyledAttributes.getDimension(index2, j61Var.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        j61Var.i = typedArrayObtainStyledAttributes.getDimension(index2, j61Var.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        j61Var.j = typedArrayObtainStyledAttributes.getDimension(index2, j61Var.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        j61Var.k = typedArrayObtainStyledAttributes.getDimension(index2, j61Var.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        g61Var.X = typedArrayObtainStyledAttributes.getInt(index2, g61Var.X);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        g61Var.Y = typedArrayObtainStyledAttributes.getInt(index2, g61Var.Y);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        g61Var.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.Z);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        g61Var.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.a0);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        g61Var.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.b0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        g61Var.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.c0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        j61Var.a = typedArrayObtainStyledAttributes.getFloat(index2, j61Var.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        g61Var.z = e(typedArrayObtainStyledAttributes, index2, g61Var.z);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        g61Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.A);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        g61Var.B = typedArrayObtainStyledAttributes.getFloat(index2, g61Var.B);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        h61Var.a = e(typedArrayObtainStyledAttributes, index2, h61Var.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                        }
                        i7++;
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        h61Var.e = typedArrayObtainStyledAttributes.getFloat(index2, h61Var.e);
                        break;
                    case 68:
                        i = indexCount2;
                        i61Var.d = typedArrayObtainStyledAttributes.getFloat(index2, i61Var.d);
                        break;
                    case 69:
                        i = indexCount2;
                        g61Var.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        g61Var.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        io.sentry.android.core.v0.c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        g61Var.f0 = typedArrayObtainStyledAttributes.getInt(index2, g61Var.f0);
                        break;
                    case 73:
                        i = indexCount2;
                        g61Var.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.g0);
                        break;
                    case 74:
                        i = indexCount2;
                        g61Var.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        g61Var.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, g61Var.n0);
                        break;
                    case 76:
                        i = indexCount2;
                        h61Var.c = typedArrayObtainStyledAttributes.getInt(index2, h61Var.c);
                        break;
                    case 77:
                        i = indexCount2;
                        g61Var.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        i61Var.b = typedArrayObtainStyledAttributes.getInt(index2, i61Var.b);
                        break;
                    case 79:
                        i = indexCount2;
                        h61Var.d = typedArrayObtainStyledAttributes.getFloat(index2, h61Var.d);
                        break;
                    case 80:
                        i = indexCount2;
                        g61Var.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, g61Var.l0);
                        break;
                    case 81:
                        i = indexCount2;
                        g61Var.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, g61Var.m0);
                        break;
                    case 82:
                        i = indexCount2;
                        h61Var.b = typedArrayObtainStyledAttributes.getInteger(index2, h61Var.b);
                        break;
                    case 83:
                        i = indexCount2;
                        j61Var.h = e(typedArrayObtainStyledAttributes, index2, j61Var.h);
                        break;
                    case 84:
                        i = indexCount2;
                        h61Var.g = typedArrayObtainStyledAttributes.getInteger(index2, h61Var.g);
                        break;
                    case 85:
                        i = indexCount2;
                        h61Var.f = typedArrayObtainStyledAttributes.getFloat(index2, h61Var.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            h61Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            h61Var.h = string2;
                            if (string2.indexOf("/") > 0) {
                                h61Var.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, h61Var.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        io.sentry.android.core.v0.j("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        io.sentry.android.core.v0.j("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        g61Var.q = e(typedArrayObtainStyledAttributes, index2, g61Var.q);
                        break;
                    case 92:
                        i = indexCount2;
                        g61Var.r = e(typedArrayObtainStyledAttributes, index2, g61Var.r);
                        break;
                    case 93:
                        i = indexCount2;
                        g61Var.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.L);
                        break;
                    case 94:
                        i = indexCount2;
                        g61Var.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, g61Var.S);
                        break;
                    case 95:
                        i = indexCount2;
                        f(g61Var, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        f(g61Var, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        g61Var.o0 = typedArrayObtainStyledAttributes.getInt(index2, g61Var.o0);
                        break;
                }
                i7++;
            }
            if (g61Var.j0 != null) {
                g61Var.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return f61Var;
    }

    public static int e(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public static void f(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        e61 e61Var;
        g61 g61Var;
        b61 b61Var;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof b61) {
                    b61Var = (b61) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) b61Var).width = i4;
                        b61Var.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) b61Var).height = i4;
                        b61Var.X = z;
                        return;
                    }
                }
                if (obj instanceof g61) {
                    g61Var = (g61) obj;
                    if (i2 == 0) {
                        g61Var.b = i4;
                        g61Var.l0 = z;
                        return;
                    } else {
                        g61Var.c = i4;
                        g61Var.m0 = z;
                        return;
                    }
                }
                if (obj instanceof e61) {
                    e61Var = (e61) obj;
                    if (i2 == 0) {
                        e61Var.b(23, i4);
                        e61Var.d(80, z);
                        return;
                    } else {
                        e61Var.b(21, i4);
                        e61Var.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof b61) {
                b61Var = (b61) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) b61Var).width = i4;
                    b61Var.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) b61Var).height = i4;
                    b61Var.X = z;
                    return;
                }
            }
            if (obj instanceof g61) {
                g61Var = (g61) obj;
                if (i2 == 0) {
                    g61Var.b = i4;
                    g61Var.l0 = z;
                    return;
                } else {
                    g61Var.c = i4;
                    g61Var.m0 = z;
                    return;
                }
            }
            if (obj instanceof e61) {
                e61Var = (e61) obj;
                if (i2 == 0) {
                    e61Var.b(23, i4);
                    e61Var.d(80, z);
                    return;
                } else {
                    e61Var.b(21, i4);
                    e61Var.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof b61) {
                    b61 b61Var2 = (b61) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) b61Var2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) b61Var2).height = 0;
                    }
                    g(b61Var2, strTrim2);
                    return;
                }
                if (obj instanceof g61) {
                    ((g61) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof e61) {
                        ((e61) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof b61) {
                        b61 b61Var3 = (b61) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) b61Var3).width = 0;
                            b61Var3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) b61Var3).height = 0;
                            b61Var3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof g61) {
                        g61 g61Var2 = (g61) obj;
                        if (i2 == 0) {
                            g61Var2.b = 0;
                            g61Var2.U = f;
                            return;
                        } else {
                            g61Var2.c = 0;
                            g61Var2.T = f;
                            return;
                        }
                    }
                    if (obj instanceof e61) {
                        e61 e61Var2 = (e61) obj;
                        if (i2 == 0) {
                            e61Var2.b(23, 0);
                            e61Var2.a(39, f);
                            return;
                        } else {
                            e61Var2.b(21, 0);
                            e61Var2.a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof b61) {
                        b61 b61Var4 = (b61) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) b61Var4).width = 0;
                            b61Var4.R = fMax;
                            b61Var4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) b61Var4).height = 0;
                            b61Var4.S = fMax;
                            b61Var4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof g61) {
                        g61 g61Var3 = (g61) obj;
                        if (i2 == 0) {
                            g61Var3.b = 0;
                            g61Var3.d0 = fMax;
                            g61Var3.X = 2;
                            return;
                        } else {
                            g61Var3.c = 0;
                            g61Var3.e0 = fMax;
                            g61Var3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof e61) {
                        e61 e61Var3 = (e61) obj;
                        if (i2 == 0) {
                            e61Var3.b(23, 0);
                            e61Var3.b(54, 2);
                        } else {
                            e61Var3.b(21, 0);
                            e61Var3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void g(b61 b61Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        b61Var.G = str;
    }

    public final void a(Context context, int i) {
        ConstraintLayout constraintLayout;
        int i2;
        HashMap map;
        int i3;
        int i4;
        k61 k61Var = this;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout2.getChildCount();
        HashMap map2 = k61Var.b;
        map2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout2.getChildAt(i5);
            b61 b61Var = (b61) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                hk0.o("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new f61());
            }
            f61 f61Var = (f61) map2.get(Integer.valueOf(id));
            if (f61Var == null) {
                constraintLayout = constraintLayout2;
                i2 = childCount;
                map = map2;
                i3 = i5;
            } else {
                i61 i61Var = f61Var.b;
                g61 g61Var = f61Var.d;
                j61 j61Var = f61Var.e;
                constraintLayout = constraintLayout2;
                HashMap map3 = new HashMap();
                i2 = childCount;
                Class<?> cls = childAt.getClass();
                map = map2;
                HashMap map4 = k61Var.a;
                for (String str : map4.keySet()) {
                    x51 x51Var = (x51) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i4 = i5;
                            try {
                                map3.put(str, new x51(x51Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                StringBuilder sbP = ua5.p(" Custom Attribute \"", str, "\" not found on ");
                                sbP.append(cls.getName());
                                io.sentry.android.core.v0.d("TransitionLayout", sbP.toString(), e);
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                io.sentry.android.core.v0.d("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                StringBuilder sbP2 = ua5.p(" Custom Attribute \"", str, "\" not found on ");
                                sbP2.append(cls.getName());
                                io.sentry.android.core.v0.d("TransitionLayout", sbP2.toString(), e);
                            }
                        } else {
                            i4 = i5;
                            map3.put(str, new x51(x51Var, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        i4 = i5;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        i4 = i5;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        i4 = i5;
                    }
                    map4 = map5;
                    i5 = i4;
                }
                i3 = i5;
                f61Var.f = map3;
                f61Var.a = id;
                g61Var.h = b61Var.e;
                g61Var.i = b61Var.f;
                g61Var.j = b61Var.g;
                g61Var.k = b61Var.h;
                g61Var.l = b61Var.i;
                g61Var.m = b61Var.j;
                g61Var.n = b61Var.k;
                g61Var.f865o = b61Var.l;
                g61Var.p = b61Var.m;
                g61Var.q = b61Var.n;
                g61Var.r = b61Var.f399o;
                g61Var.s = b61Var.s;
                g61Var.t = b61Var.t;
                g61Var.u = b61Var.u;
                g61Var.v = b61Var.v;
                g61Var.w = b61Var.E;
                g61Var.x = b61Var.F;
                g61Var.y = b61Var.G;
                g61Var.z = b61Var.p;
                g61Var.A = b61Var.q;
                g61Var.B = b61Var.r;
                g61Var.C = b61Var.T;
                g61Var.D = b61Var.U;
                g61Var.E = b61Var.V;
                g61Var.f = b61Var.c;
                g61Var.d = b61Var.a;
                g61Var.e = b61Var.b;
                g61Var.b = ((ViewGroup.MarginLayoutParams) b61Var).width;
                g61Var.c = ((ViewGroup.MarginLayoutParams) b61Var).height;
                g61Var.F = ((ViewGroup.MarginLayoutParams) b61Var).leftMargin;
                g61Var.G = ((ViewGroup.MarginLayoutParams) b61Var).rightMargin;
                g61Var.H = ((ViewGroup.MarginLayoutParams) b61Var).topMargin;
                g61Var.I = ((ViewGroup.MarginLayoutParams) b61Var).bottomMargin;
                g61Var.L = b61Var.D;
                g61Var.T = b61Var.I;
                g61Var.U = b61Var.H;
                g61Var.W = b61Var.K;
                g61Var.V = b61Var.J;
                g61Var.l0 = b61Var.W;
                g61Var.m0 = b61Var.X;
                g61Var.X = b61Var.L;
                g61Var.Y = b61Var.M;
                g61Var.Z = b61Var.P;
                g61Var.a0 = b61Var.Q;
                g61Var.b0 = b61Var.N;
                g61Var.c0 = b61Var.O;
                g61Var.d0 = b61Var.R;
                g61Var.e0 = b61Var.S;
                g61Var.k0 = b61Var.Y;
                g61Var.N = b61Var.x;
                g61Var.P = b61Var.z;
                g61Var.M = b61Var.w;
                g61Var.O = b61Var.y;
                g61Var.R = b61Var.A;
                g61Var.Q = b61Var.B;
                g61Var.S = b61Var.C;
                g61Var.o0 = b61Var.Z;
                g61Var.J = b61Var.getMarginEnd();
                g61Var.K = b61Var.getMarginStart();
                i61Var.a = childAt.getVisibility();
                i61Var.c = childAt.getAlpha();
                j61Var.a = childAt.getRotation();
                j61Var.b = childAt.getRotationX();
                j61Var.c = childAt.getRotationY();
                j61Var.d = childAt.getScaleX();
                j61Var.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    j61Var.f = pivotX;
                    j61Var.g = pivotY;
                }
                j61Var.i = childAt.getTranslationX();
                j61Var.j = childAt.getTranslationY();
                j61Var.k = childAt.getTranslationZ();
                if (j61Var.l) {
                    j61Var.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    g61Var.n0 = barrier.getAllowsGoneWidget();
                    g61Var.i0 = barrier.getReferencedIds();
                    g61Var.f0 = barrier.getType();
                    g61Var.g0 = barrier.getMargin();
                }
            }
            i5 = i3 + 1;
            k61Var = this;
            constraintLayout2 = constraintLayout;
            childCount = i2;
            map2 = map;
        }
    }

    public final void d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    f61 f61VarC = c(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        f61VarC.d.a = true;
                    }
                    this.b.put(Integer.valueOf(f61VarC.a), f61VarC);
                }
            }
        } catch (IOException e2) {
            io.sentry.android.core.v0.d("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            io.sentry.android.core.v0.d("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
