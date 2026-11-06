package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LiveData;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatUIModelLocatorAndroid;
import com.teamviewer.chatviewmodel.swig.IStartChatUIModelAndroid;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class qf0 {
    public static final yy0 c;
    public static final yy0 d;
    public static final yy0 f;
    public static final yy0 g;
    public static final yy0 h;
    public static final aw0 i;
    public static final float j;
    public static final aw k;
    public static final ju l;
    public static final yn1 m;
    public static final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f1826o;
    public static boolean p;
    public static final s17 q;
    public static final o17 r;
    public static final bi2 s;
    public static final bi2 t;
    public static final bi2[] u;
    public static final hc1[] a = new hc1[0];
    public static final int[][] b = {new int[]{121, 120, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, 157, 156, 163, 162, 169, 168, 175, 174, 181, 180, 187, 186, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, 189, 188, 195, 194, 201, 200, 816, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, 191, 190, 197, 196, 203, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, 265, 264, 259, 258, 253, 252, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, 249, 248, 243, 242, 237, 236, 231, 230, 225, 224, 219, 218, 213, 212, 207, 206, 821, 820}, new int[]{287, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, 251, 250, 245, 244, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, 318, 325, 324, 331, 330, 337, 336, 343, 342, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, 304, 311, 310, 317, 316, 323, 322, 329, 328, 335, 334, 341, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{409, 408, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, 410, 405, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{415, 414, 421, 420, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{417, 416, 423, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{419, 418, 425, 424, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, 505, 504, 511, 510, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, 507, 506, 513, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, 600, 607, 606, 613, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, 603, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, 605, 604, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};
    public static final yy0 e = new yy0(-1983558340, false, new bz0(13));

    static {
        byte b2 = 12;
        c = new yy0(1571237781, false, new zy0(b2));
        d = new yy0(749361604, false, new bz0(b2));
        new yy0(859994639, false, new bz0((byte) 14));
        new yy0(1876272229, false, new bz0((byte) 15));
        byte b3 = 18;
        f = new yy0(1121996006, false, new fz0(b3));
        g = new yy0(1375468337, false, new hz0((byte) 9));
        new yy0(1500985571, false, new hz0((byte) 10));
        h = new yy0(-1759434350, false, new iz0(b3));
        i = aw0.x;
        j = 1.0f;
        k = new aw((byte) 11);
        l = new ju((byte) 22);
        m = new yn1(new le5((byte) 1), new le5((byte) 2));
        n = new Object();
        q = new s17((byte) 1);
        r = new o17();
        bi2 bi2Var = new bi2("register", -1, 1L, true);
        s = bi2Var;
        bi2 bi2Var2 = new bi2("unregister", -1, 1L, true);
        t = bi2Var2;
        u = new bi2[]{bi2Var, bi2Var2};
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable A(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int i3 = dataInputStream.readInt();
            ?? r0 = new Boolean[i3];
            while (i2 < i3) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i4 = dataInputStream.readInt();
            ?? r1 = new Byte[i4];
            while (i2 < i4) {
                r1[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i5 = dataInputStream.readInt();
            ?? r2 = new Integer[i5];
            while (i2 < i5) {
                r2[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i6 = dataInputStream.readInt();
            ?? r3 = new Long[i6];
            while (i2 < i6) {
                r3[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i7 = dataInputStream.readInt();
            ?? r4 = new Float[i7];
            while (i2 < i7) {
                r4[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i8 = dataInputStream.readInt();
            ?? r5 = new Double[i8];
            while (i2 < i8) {
                r5[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r5;
        }
        if (b2 != 14) {
            hk0.l(fx3.e(b2, "Unsupported type "));
            return null;
        }
        int i9 = dataInputStream.readInt();
        ?? r6 = new String[i9];
        while (i2 < i9) {
            String utf = dataInputStream.readUTF();
            if (im3.n(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i2] = utf;
            i2++;
        }
        return r6;
    }

    public static final c01 B(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (c01) weakReference.get();
        }
        return null;
    }

    public static final int C(fq6 fq6Var, rp3 rp3Var, String str) {
        fq6Var.getClass();
        str.getClass();
        O(rp3Var, fq6Var);
        int iD = fq6Var.d(str);
        if (iD != -3 || !rp3Var.a.e) {
            return iD;
        }
        d51 d51Var = rp3Var.c;
        ql1 ql1Var = new ql1(fq6Var, rp3Var, (byte) 16);
        ConcurrentHashMap concurrentHashMap = d51Var.a;
        Map map = (Map) concurrentHashMap.get(fq6Var);
        aw awVar = k;
        Object obj = map != null ? map.get(awVar) : null;
        Object objA = obj != null ? obj : null;
        if (objA == null) {
            objA = ql1Var.a();
            Object concurrentHashMap2 = concurrentHashMap.get(fq6Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(fq6Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(awVar, objA);
        }
        Integer num = (Integer) ((Map) objA).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static int D(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final int E(vu7 vu7Var) {
        se5 se5Var = null;
        for (int i2 = vu7Var.h - 1; -1 < i2; i2--) {
            vu7Var.c(i2);
            se5 se5VarA = vu7Var.a(i2);
            if (im3.n(se5VarA.a(), yl7.I) || im3.n(se5VarA.a(), yl7.K)) {
                return -(se5Var != null ? (int) (se5Var.e >> 32) : G(se5VarA));
            }
            if (se5VarA.a().b == 3 || se5VarA.a().b == 2) {
                se5Var = se5VarA;
            }
        }
        return 0;
    }

    public static final int F(vu7 vu7Var) {
        byte b2 = vu7Var.h;
        se5 se5Var = null;
        for (int i2 = 0; i2 < b2; i2++) {
            vu7Var.c(i2);
            se5 se5VarA = vu7Var.a(i2);
            if (im3.n(se5VarA.a(), yl7.J) || im3.n(se5VarA.a(), yl7.L)) {
                return ((int) (vu7Var.g >> 32)) - (se5Var != null ? G(se5Var) : (int) (se5VarA.e >> 32));
            }
            if (se5VarA.a().b == 3 || se5VarA.a().b == 2) {
                se5Var = se5VarA;
            }
        }
        return 0;
    }

    public static final int G(se5 se5Var) {
        return ((int) (se5Var.e >> 32)) + ((int) (se5Var.d >> 32));
    }

    public static final boolean H(rp3 rp3Var, fq6 fq6Var) {
        fq6Var.getClass();
        if (rp3Var.a.a) {
            return true;
        }
        List annotations = fq6Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof uq3) {
                return true;
            }
        }
        return false;
    }

    public static final lo4 I(LiveData... liveDataArr) {
        LiveData[] liveDataArr2 = (LiveData[]) Arrays.copyOf(liveDataArr, liveDataArr.length);
        lo4 lo4Var = new lo4();
        byte b2 = 2;
        c7 c7Var = new c7(lo4Var, liveDataArr2, b2);
        c7Var.a();
        for (LiveData liveData : liveDataArr2) {
            lo4Var.b(liveData, new b7(new t(c7Var, (byte) 9), b2));
        }
        return lo4Var;
    }

    public static boolean J(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static List K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List L(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return ea2.m;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List M(Object obj) {
        return obj != null ? K(obj) : ea2.m;
    }

    public static ArrayList N(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new hw(objArr, true));
    }

    public static final void O(rp3 rp3Var, fq6 fq6Var) {
        fq6Var.getClass();
        im3.n(fq6Var.k(), lc7.d);
    }

    public static void P(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final String Q(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt.equals(JSONObject.NULL)) {
            return null;
        }
        return objOpt.toString();
    }

    public static final List R(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : K(list.get(0));
        }
        return ea2.m;
    }

    public static c35 S(w36 w36Var) {
        int i2 = Integer.parseInt(w36Var.c0(Long.MAX_VALUE));
        long j2 = Long.parseLong(w36Var.c0(Long.MAX_VALUE));
        long j3 = Long.parseLong(w36Var.c0(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(w36Var.c0(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strC0 = w36Var.c0(Long.MAX_VALUE);
            int iY = ub7.Y(strC0, ':', 0, 6);
            if (iY == -1) {
                gk0.h("Unexpected header: ".concat(strC0));
                return null;
            }
            String string = ub7.x0(strC0.substring(0, iY)).toString();
            String strSubstring = strC0.substring(iY + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new c35(i2, j2, j3, new w25(xm4.V(linkedHashMap)), null, null);
    }

    public static final fs4 T(fs4 fs4Var, lh7 lh7Var, jr7 jr7Var, kr7 kr7Var, kd1 kd1Var) {
        return fs4Var.f(new tp7(lh7Var, jr7Var, kr7Var, kd1Var));
    }

    public static void U() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static byte[] V(pg1 pg1Var) {
        pg1Var.getClass();
        HashMap map = pg1Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    W(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kh.n(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e2) {
            we4.f().e(yh1.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void W(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                hk0.g(ua5.m("Unsupported value type ", w86.a.b(obj.getClass()).f()));
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            x86 x86Var = w86.a;
            wt3 wt3VarB = x86Var.b(cls);
            if (wt3VarB.equals(x86Var.b(Boolean[].class))) {
                i2 = 8;
            } else if (wt3VarB.equals(x86Var.b(Byte[].class))) {
                i2 = 9;
            } else if (wt3VarB.equals(x86Var.b(Integer[].class))) {
                i2 = 10;
            } else if (wt3VarB.equals(x86Var.b(Long[].class))) {
                i2 = 11;
            } else if (wt3VarB.equals(x86Var.b(Float[].class))) {
                i2 = 12;
            } else if (wt3VarB.equals(x86Var.b(Double[].class))) {
                i2 = 13;
            } else {
                if (!wt3VarB.equals(x86Var.b(String[].class))) {
                    hk0.g(ua5.m("Unsupported value type ", x86Var.b(objArr.getClass()).c()));
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static String X(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? fx3.g("CornerRadius.circular(", lq1.N(Float.intBitsToFloat(i2)), ")") : fx3.h("CornerRadius.elliptical(", lq1.N(Float.intBitsToFloat(i2)), ", ", lq1.N(Float.intBitsToFloat(i3)), ")");
    }

    public static void Y(c35 c35Var, u36 u36Var) {
        u36Var.j(c35Var.a);
        u36Var.writeByte(10);
        u36Var.j(c35Var.b);
        u36Var.writeByte(10);
        u36Var.j(c35Var.c);
        u36Var.writeByte(10);
        Set<Map.Entry> setEntrySet = c35Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        u36Var.j(size);
        u36Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                u36Var.V((String) entry.getKey());
                u36Var.V(":");
                u36Var.V(str);
                u36Var.writeByte(10);
            }
        }
    }

    public static final void a(boolean z, Function0 function0, Function0 function1, fs4 fs4Var, String str, f5 f5Var, ux2 ux2Var, int i2) {
        String str2;
        f5 f5Var2;
        ux2 ux2Var2;
        int i3;
        f5 f5Var3;
        Object obj;
        String strM;
        String strM2;
        ux2 ux2Var3 = ux2Var;
        function0.getClass();
        function1.getClass();
        ux2Var3.Y(-1771810554);
        byte b2 = 4;
        int i4 = i2 | (ux2Var3.g(z) ? 4 : 2) | (ux2Var3.h(function0) ? 32 : 16) | (ux2Var3.h(function1) ? 256 : 128) | (ux2Var3.f(fs4Var) ? 2048 : 1024) | 90112;
        byte b3 = 1;
        byte b4 = 0;
        if (ux2Var3.N(i4 & 1, (74899 & i4) != 74898)) {
            ux2Var3.S();
            if ((i2 & 1) == 0 || ux2Var3.x()) {
                dl5 dl5Var = new dl5(new e5(b4), b3);
                we8 we8VarA = id4.a(ux2Var3);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ux2Var2 = ux2Var;
                i3 = i4 & (-458753);
                f5Var3 = (f5) g57.t(w86.a.b(f5.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                str2 = "TVTA-settings-accountSignedOut";
            } else {
                ux2Var3.Q();
                i3 = i4 & (-458753);
                str2 = str;
                f5Var3 = f5Var;
                ux2Var2 = ux2Var3;
            }
            ux2Var2.q();
            px4 px4VarG = g57.g(f5Var3.p, ux2Var2);
            int i5 = i3 >> 3;
            px4 px4VarT = h57.t(function0, ux2Var2);
            boolean zF = ux2Var2.f(px4VarG) | ux2Var2.f(px4VarT);
            Object objK = ux2Var2.K();
            boolean z2 = false;
            if (zF || objK == e01.a) {
                obj = objK;
                h0 h0Var = new h0((Object) px4VarG, (Object) px4VarT, (hc1) (z2 ? 1 : 0), b2);
                ux2Var2.g0(h0Var);
                obj = h0Var;
            }
            obj = objK;
            ck3.i(f88.a, (hw2) obj, ux2Var2);
            if (z) {
                ux2Var2.W(1140636533);
                strM = ((d5) px4VarG.getValue()).a;
                if (strM == null) {
                    strM = to7.m(ux2Var2, -1902866962, R.string.tv_account_name, ux2Var2, false);
                } else {
                    ux2Var2.W(-1902867923);
                    ux2Var2.p(false);
                }
                ux2Var2.p(false);
            } else {
                strM = to7.m(ux2Var2, 1140718621, R.string.settings_accountSignIn, ux2Var2, false);
            }
            if (z) {
                ux2Var2.W(1140841598);
                strM2 = ((d5) px4VarG.getValue()).b;
                if (strM2 == null) {
                    strM2 = to7.m(ux2Var2, -1902860254, R.string.tv_account_display_name_empty_state, ux2Var2, false);
                } else {
                    ux2Var2.W(-1902861308);
                    ux2Var2.p(false);
                }
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1140944456);
                ux2Var2.p(false);
                strM2 = null;
            }
            String str3 = z ? ((d5) px4VarG.getValue()).c : null;
            int i6 = i3;
            ka0.a(new s4(strM, strM2, str3), z, fs4Var, null, function1, str2, ux2Var2, ((i6 << 6) & 57344) | (i5 & 896) | ((i6 << 3) & 112) | 196608, 8);
            f5Var2 = f5Var3;
        } else {
            ux2Var.Q();
            str2 = str;
            f5Var2 = f5Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a5(z, function0, function1, fs4Var, str2, f5Var2, i2);
        }
    }

    public static final void b(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(-1154230571);
        int i3 = i2 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 << 3;
            cs4 cs4Var = cs4.b;
            l47.d(new sk7(y57.g(R.string.tv_advanced_logging), null, new yk7(R.drawable.diagram), null, 26), z, function1, cs4Var, "TVTA-settings-advancedLogging", m77.z(R.string.tv_advanced_logging, ux2Var), ux2Var, (i4 & 896) | (i4 & 112) | 24576 | 3072, 32);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i2, (byte) 0);
        }
    }

    public static final void c(final q20 q20Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        q20Var.getClass();
        ux2Var.Y(-2033590125);
        final byte b2 = 2;
        int i3 = i2 | (ux2Var.h(q20Var) ? 4 : 2) | 48;
        final byte b3 = 0;
        final byte b4 = 1;
        final byte b5 = 3;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            Function0 function0 = q20Var.f;
            yy0 yy0VarO = au8.O(-1552572085, new hw2() { // from class: o.r20
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b6 = b3;
                    aw awVar = e01.a;
                    f88 f88Var = f88.a;
                    final q20 q20Var2 = q20Var;
                    final byte b7 = 1;
                    final byte b8 = 0;
                    switch (b6) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                boolean zH = ux2Var2.h(q20Var2);
                                Object objK = ux2Var2.K();
                                if (zH || objK == awVar) {
                                    objK = new Function0() { // from class: o.s20
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b9 = b8;
                                            f88 f88Var2 = f88.a;
                                            q20 q20Var3 = q20Var2;
                                            switch (b9) {
                                                case 0:
                                                    q20Var3.d.a();
                                                    q20Var3.f.a();
                                                    break;
                                                default:
                                                    q20Var3.f.a();
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    ux2Var2.g0(objK);
                                }
                                v67.d((Function0) objK, null, null, false, null, au8.O(1967760048, new b9((Object) q20Var2, (byte) 3), ux2Var2), ux2Var2, 196608, 30);
                            }
                            break;
                        case 1:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                String str = q20Var2.e;
                                if (str != null) {
                                    ux2Var3.W(-1941601389);
                                    boolean zH2 = ux2Var3.h(q20Var2);
                                    Object objK2 = ux2Var3.K();
                                    if (zH2 || objK2 == awVar) {
                                        objK2 = new Function0() { // from class: o.s20
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object a() {
                                                byte b9 = b7;
                                                f88 f88Var2 = f88.a;
                                                q20 q20Var3 = q20Var2;
                                                switch (b9) {
                                                    case 0:
                                                        q20Var3.d.a();
                                                        q20Var3.f.a();
                                                        break;
                                                    default:
                                                        q20Var3.f.a();
                                                        break;
                                                }
                                                return f88Var2;
                                            }
                                        };
                                        ux2Var3.g0(objK2);
                                    }
                                    v67.d((Function0) objK2, null, null, false, null, au8.O(-1612617214, new t20(str, b8), ux2Var3), ux2Var3, 196608, 30);
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var3.W(-1941601390);
                                    ux2Var3.p(false);
                                }
                            }
                            break;
                        case 2:
                            ux2 ux2Var4 = (ux2) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                ux2Var4.Q();
                            } else {
                                String str2 = q20Var2.a;
                                if (str2 != null) {
                                    ux2Var4.W(583887721);
                                    qs7.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var4, 0, 24960, 241662);
                                    ux2Var4.p(false);
                                } else {
                                    ux2Var4.W(583887720);
                                    ux2Var4.p(false);
                                }
                            }
                            break;
                        default:
                            ux2 ux2Var5 = (ux2) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (!ux2Var5.N(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                ux2Var5.Q();
                            } else {
                                String str3 = q20Var2.b;
                                if (str3 != null) {
                                    ux2Var5.W(-300837329);
                                    hk6 hk6VarW = im3.W(ux2Var5);
                                    Object objK3 = ux2Var5.K();
                                    if (objK3 == awVar) {
                                        objK3 = ck3.w(ux2Var5);
                                        ux2Var5.g0(objK3);
                                    }
                                    qs7.b(str3, o77.t(cs4.b, hk6VarW, (me1) objK3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262140);
                                    ux2Var5.p(false);
                                } else {
                                    ux2Var5.W(-300837330);
                                    ux2Var5.p(false);
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var);
            yy0 yy0VarO2 = au8.O(341761801, new hw2() { // from class: o.r20
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b6 = b4;
                    aw awVar = e01.a;
                    f88 f88Var = f88.a;
                    final q20 q20Var2 = q20Var;
                    final byte b7 = 1;
                    final byte b8 = 0;
                    switch (b6) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                boolean zH = ux2Var2.h(q20Var2);
                                Object objK = ux2Var2.K();
                                if (zH || objK == awVar) {
                                    objK = new Function0() { // from class: o.s20
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b9 = b8;
                                            f88 f88Var2 = f88.a;
                                            q20 q20Var3 = q20Var2;
                                            switch (b9) {
                                                case 0:
                                                    q20Var3.d.a();
                                                    q20Var3.f.a();
                                                    break;
                                                default:
                                                    q20Var3.f.a();
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    ux2Var2.g0(objK);
                                }
                                v67.d((Function0) objK, null, null, false, null, au8.O(1967760048, new b9((Object) q20Var2, (byte) 3), ux2Var2), ux2Var2, 196608, 30);
                            }
                            break;
                        case 1:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                String str = q20Var2.e;
                                if (str != null) {
                                    ux2Var3.W(-1941601389);
                                    boolean zH2 = ux2Var3.h(q20Var2);
                                    Object objK2 = ux2Var3.K();
                                    if (zH2 || objK2 == awVar) {
                                        objK2 = new Function0() { // from class: o.s20
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object a() {
                                                byte b9 = b7;
                                                f88 f88Var2 = f88.a;
                                                q20 q20Var3 = q20Var2;
                                                switch (b9) {
                                                    case 0:
                                                        q20Var3.d.a();
                                                        q20Var3.f.a();
                                                        break;
                                                    default:
                                                        q20Var3.f.a();
                                                        break;
                                                }
                                                return f88Var2;
                                            }
                                        };
                                        ux2Var3.g0(objK2);
                                    }
                                    v67.d((Function0) objK2, null, null, false, null, au8.O(-1612617214, new t20(str, b8), ux2Var3), ux2Var3, 196608, 30);
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var3.W(-1941601390);
                                    ux2Var3.p(false);
                                }
                            }
                            break;
                        case 2:
                            ux2 ux2Var4 = (ux2) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                ux2Var4.Q();
                            } else {
                                String str2 = q20Var2.a;
                                if (str2 != null) {
                                    ux2Var4.W(583887721);
                                    qs7.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var4, 0, 24960, 241662);
                                    ux2Var4.p(false);
                                } else {
                                    ux2Var4.W(583887720);
                                    ux2Var4.p(false);
                                }
                            }
                            break;
                        default:
                            ux2 ux2Var5 = (ux2) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (!ux2Var5.N(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                ux2Var5.Q();
                            } else {
                                String str3 = q20Var2.b;
                                if (str3 != null) {
                                    ux2Var5.W(-300837329);
                                    hk6 hk6VarW = im3.W(ux2Var5);
                                    Object objK3 = ux2Var5.K();
                                    if (objK3 == awVar) {
                                        objK3 = ck3.w(ux2Var5);
                                        ux2Var5.g0(objK3);
                                    }
                                    qs7.b(str3, o77.t(cs4.b, hk6VarW, (me1) objK3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262140);
                                    ux2Var5.p(false);
                                } else {
                                    ux2Var5.W(-300837330);
                                    ux2Var5.p(false);
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var);
            yy0 yy0VarO3 = au8.O(-2058871609, new hw2() { // from class: o.r20
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b6 = b2;
                    aw awVar = e01.a;
                    f88 f88Var = f88.a;
                    final q20 q20Var2 = q20Var;
                    final byte b7 = 1;
                    final byte b8 = 0;
                    switch (b6) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                boolean zH = ux2Var2.h(q20Var2);
                                Object objK = ux2Var2.K();
                                if (zH || objK == awVar) {
                                    objK = new Function0() { // from class: o.s20
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b9 = b8;
                                            f88 f88Var2 = f88.a;
                                            q20 q20Var3 = q20Var2;
                                            switch (b9) {
                                                case 0:
                                                    q20Var3.d.a();
                                                    q20Var3.f.a();
                                                    break;
                                                default:
                                                    q20Var3.f.a();
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    ux2Var2.g0(objK);
                                }
                                v67.d((Function0) objK, null, null, false, null, au8.O(1967760048, new b9((Object) q20Var2, (byte) 3), ux2Var2), ux2Var2, 196608, 30);
                            }
                            break;
                        case 1:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                String str = q20Var2.e;
                                if (str != null) {
                                    ux2Var3.W(-1941601389);
                                    boolean zH2 = ux2Var3.h(q20Var2);
                                    Object objK2 = ux2Var3.K();
                                    if (zH2 || objK2 == awVar) {
                                        objK2 = new Function0() { // from class: o.s20
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object a() {
                                                byte b9 = b7;
                                                f88 f88Var2 = f88.a;
                                                q20 q20Var3 = q20Var2;
                                                switch (b9) {
                                                    case 0:
                                                        q20Var3.d.a();
                                                        q20Var3.f.a();
                                                        break;
                                                    default:
                                                        q20Var3.f.a();
                                                        break;
                                                }
                                                return f88Var2;
                                            }
                                        };
                                        ux2Var3.g0(objK2);
                                    }
                                    v67.d((Function0) objK2, null, null, false, null, au8.O(-1612617214, new t20(str, b8), ux2Var3), ux2Var3, 196608, 30);
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var3.W(-1941601390);
                                    ux2Var3.p(false);
                                }
                            }
                            break;
                        case 2:
                            ux2 ux2Var4 = (ux2) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                ux2Var4.Q();
                            } else {
                                String str2 = q20Var2.a;
                                if (str2 != null) {
                                    ux2Var4.W(583887721);
                                    qs7.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var4, 0, 24960, 241662);
                                    ux2Var4.p(false);
                                } else {
                                    ux2Var4.W(583887720);
                                    ux2Var4.p(false);
                                }
                            }
                            break;
                        default:
                            ux2 ux2Var5 = (ux2) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (!ux2Var5.N(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                ux2Var5.Q();
                            } else {
                                String str3 = q20Var2.b;
                                if (str3 != null) {
                                    ux2Var5.W(-300837329);
                                    hk6 hk6VarW = im3.W(ux2Var5);
                                    Object objK3 = ux2Var5.K();
                                    if (objK3 == awVar) {
                                        objK3 = ck3.w(ux2Var5);
                                        ux2Var5.g0(objK3);
                                    }
                                    qs7.b(str3, o77.t(cs4.b, hk6VarW, (me1) objK3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262140);
                                    ux2Var5.p(false);
                                } else {
                                    ux2Var5.W(-300837330);
                                    ux2Var5.p(false);
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var);
            yy0 yy0VarO4 = au8.O(-1111704666, new hw2() { // from class: o.r20
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b6 = b5;
                    aw awVar = e01.a;
                    f88 f88Var = f88.a;
                    final q20 q20Var2 = q20Var;
                    final byte b7 = 1;
                    final byte b8 = 0;
                    switch (b6) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(1 & iIntValue, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                boolean zH = ux2Var2.h(q20Var2);
                                Object objK = ux2Var2.K();
                                if (zH || objK == awVar) {
                                    objK = new Function0() { // from class: o.s20
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object a() {
                                            byte b9 = b8;
                                            f88 f88Var2 = f88.a;
                                            q20 q20Var3 = q20Var2;
                                            switch (b9) {
                                                case 0:
                                                    q20Var3.d.a();
                                                    q20Var3.f.a();
                                                    break;
                                                default:
                                                    q20Var3.f.a();
                                                    break;
                                            }
                                            return f88Var2;
                                        }
                                    };
                                    ux2Var2.g0(objK);
                                }
                                v67.d((Function0) objK, null, null, false, null, au8.O(1967760048, new b9((Object) q20Var2, (byte) 3), ux2Var2), ux2Var2, 196608, 30);
                            }
                            break;
                        case 1:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                String str = q20Var2.e;
                                if (str != null) {
                                    ux2Var3.W(-1941601389);
                                    boolean zH2 = ux2Var3.h(q20Var2);
                                    Object objK2 = ux2Var3.K();
                                    if (zH2 || objK2 == awVar) {
                                        objK2 = new Function0() { // from class: o.s20
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object a() {
                                                byte b9 = b7;
                                                f88 f88Var2 = f88.a;
                                                q20 q20Var3 = q20Var2;
                                                switch (b9) {
                                                    case 0:
                                                        q20Var3.d.a();
                                                        q20Var3.f.a();
                                                        break;
                                                    default:
                                                        q20Var3.f.a();
                                                        break;
                                                }
                                                return f88Var2;
                                            }
                                        };
                                        ux2Var3.g0(objK2);
                                    }
                                    v67.d((Function0) objK2, null, null, false, null, au8.O(-1612617214, new t20(str, b8), ux2Var3), ux2Var3, 196608, 30);
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var3.W(-1941601390);
                                    ux2Var3.p(false);
                                }
                            }
                            break;
                        case 2:
                            ux2 ux2Var4 = (ux2) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (!ux2Var4.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                ux2Var4.Q();
                            } else {
                                String str2 = q20Var2.a;
                                if (str2 != null) {
                                    ux2Var4.W(583887721);
                                    qs7.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var4, 0, 24960, 241662);
                                    ux2Var4.p(false);
                                } else {
                                    ux2Var4.W(583887720);
                                    ux2Var4.p(false);
                                }
                            }
                            break;
                        default:
                            ux2 ux2Var5 = (ux2) obj;
                            int iIntValue4 = ((Integer) obj2).intValue();
                            if (!ux2Var5.N(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                                ux2Var5.Q();
                            } else {
                                String str3 = q20Var2.b;
                                if (str3 != null) {
                                    ux2Var5.W(-300837329);
                                    hk6 hk6VarW = im3.W(ux2Var5);
                                    Object objK3 = ux2Var5.K();
                                    if (objK3 == awVar) {
                                        objK3 = ck3.w(ux2Var5);
                                        ux2Var5.g0(objK3);
                                    }
                                    qs7.b(str3, o77.t(cs4.b, hk6VarW, (me1) objK3), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var5, 0, 0, 262140);
                                    ux2Var5.p(false);
                                } else {
                                    ux2Var5.W(-300837330);
                                    ux2Var5.p(false);
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var);
            fs4Var2 = cs4.b;
            uf0.b(function0, yy0VarO, fs4Var2, yy0VarO2, yy0VarO3, yy0VarO4, null, 0L, 0L, 0L, 0L, null, ux2Var, 1772976, 0, 16272);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 3, i2, (Object) q20Var, (Object) fs4Var2);
        }
    }

    public static final void d(int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        ux2Var.Y(1579985303);
        int i3 = (ux2Var.h(function0) ? 32 : 16) | i2;
        byte b2 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            fs4 fs4VarJ = iq8.j(fs4Var, sf6.a(8.0f));
            sk7 sk7Var = new sk7(y57.g(R.string.cancel_invitation), null, null, e8.f, 6);
            boolean z = (i3 & 112) == 32;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new a9(function0, (byte) 14);
                ux2Var.g0(objK);
            }
            x37.e(sk7Var, fs4VarJ, null, (Function0) objK, "TVTA-devicesScreen-contactInfoScreen-cancelInvitationAction", ux2Var, 24576, 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x71(fs4Var, function0, i2, b2);
        }
    }

    public static final void e(int i2, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        ux2Var.Y(-324283614);
        int i3 = (ux2Var.h(function0) ? 32 : 16) | i2 | (ux2Var.h(function1) ? 256 : 128);
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), xz2.y, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-contactInfoScreen-connectOption");
            String strZ = m77.z(R.string.option_connect, ux2Var);
            boolean z = (i3 & 112) == 32;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = new a9(function0, (byte) 12);
                ux2Var.g0(objK);
            }
            k(R.drawable.ic_connect, 0, strZ, (Function0) objK, ux2Var, fs4VarA);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-contactInfoScreen-transferFileAction");
            String strZ2 = m77.z(R.string.option_file_transfer, ux2Var);
            boolean z2 = (i3 & 896) == 256;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                objK2 = new a9(function1, (byte) 13);
                ux2Var.g0(objK2);
            }
            k(R.drawable.ic_filetransfer, 0, strZ2, (Function0) objK2, ux2Var, fs4VarA2);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u71(fs4Var, function0, function1, i2);
        }
    }

    public static final void f(h71 h71Var, boolean z, fs4 fs4Var, boolean z2, ux2 ux2Var, int i2) {
        int i3;
        int i4;
        vl7 vl7VarE;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1440604465);
        int i5 = i2 | (ux2Var2.h(h71Var) ? 4 : 2) | (ux2Var2.g(z) ? 32 : 16) | (ux2Var2.g(z2) ? 2048 : 1024);
        if (ux2Var2.N(i5 & 1, (i5 & 1171) != 1170)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            b91 b91Var = h71Var.t;
            String str = h71Var.f954o;
            int iOrdinal = b91Var.ordinal();
            if (iOrdinal == 0) {
                i3 = -2080327344;
                i4 = R.string.personal_contact;
            } else if (iOrdinal == 1) {
                i3 = -2080324625;
                i4 = R.string.company_contact;
            } else {
                if (iOrdinal != 2) {
                    throw fx3.m(-2080329206, ux2Var2, false);
                }
                i3 = -2080321838;
                i4 = R.string.pending_acceptance;
            }
            String strM = to7.m(ux2Var2, i3, i4, ux2Var2, false);
            ux2Var2.U(-2080318978, h71Var);
            boolean zF = ux2Var2.f(str);
            Object objK = ux2Var2.K();
            if (zF || objK == e01.a) {
                objK = x67.o(str);
                ux2Var2.g0(objK);
            }
            ba8 ba8Var = (ba8) objK;
            ka0.x(ux2Var2);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-devicesScreen-contactInfoScreen-avatar");
            hi7 hi7Var = hi7.Size72dp;
            String str2 = h71Var.f954o;
            ContactOnlineStatus contactOnlineStatus = h71Var.s;
            boolean z3 = contactOnlineStatus != null;
            if (contactOnlineStatus == null || (vl7VarE = y57.E(contactOnlineStatus)) == null) {
                vl7VarE = vl7.Offline;
            }
            String str3 = h71Var.r;
            ba8Var.getClass();
            b77.d(hi7Var, fs4VarA, z3, vl7VarE, 0L, 0L, str2, str3, ba8Var.m, new rv0(ba8Var.n), ux2Var, 54, 104);
            ux2Var.p(false);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), "TVTA-devicesScreen-contactInfoScreen-name");
            String str4 = h71Var.f954o;
            h72 h72Var = un4.a;
            qs7.b(str4, fs4VarA2, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 2, 0, null, ((rn4) ux2Var.j(h72Var)).b.f, ux2Var, 48, 24960, 109560);
            ux2Var2 = ux2Var;
            if (z) {
                ux2Var2.W(-62479973);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-64053130);
                lq1.c(null, iq8.e, new ew(8.0f, new hk0((byte) 2)), null, 0, 0, au8.O(1608878375, new w71(z2, strM), ux2Var2), ux2Var2, 1573296);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q9(h71Var, z, fs4Var, z2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:116:0x0217  */
    /* JADX WARN: Code duplicated, block: B:122:0x0244  */
    /* JADX WARN: Code duplicated, block: B:128:0x026d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0281  */
    /* JADX WARN: Code duplicated, block: B:132:0x028e  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x031a  */
    /* JADX WARN: Code duplicated, block: B:159:0x033d  */
    /* JADX WARN: Code duplicated, block: B:165:0x034c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0376  */
    /* JADX WARN: Code duplicated, block: B:175:0x039e  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:187:0x03fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:193:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0426  */
    /* JADX WARN: Code duplicated, block: B:197:0x0438  */
    /* JADX WARN: Code duplicated, block: B:199:0x043e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0462  */
    /* JADX WARN: Code duplicated, block: B:203:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x0479  */
    /* JADX WARN: Code duplicated, block: B:207:0x0495 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x049a  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:217:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:222:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:225:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x050b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0522 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0524  */
    /* JADX WARN: Code duplicated, block: B:235:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x053f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0555  */
    /* JADX WARN: Code duplicated, block: B:244:0x055f  */
    /* JADX WARN: Code duplicated, block: B:247:0x056a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x056c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0590 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:252:0x0592  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:257:0x05df  */
    /* JADX WARN: Code duplicated, block: B:258:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:261:0x05e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:264:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:267:0x060d  */
    /* JADX WARN: Code duplicated, block: B:269:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x062d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0641 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x0643  */
    /* JADX WARN: Code duplicated, block: B:276:0x065a  */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public static final void g(final h71 h71Var, final boolean z, final Function1 function1, final Function1 function2, final Function0 function0, fs4 fs4Var, final Function1 function3, final Function1 function4, final Function1 function5, final vx6 vx6Var, final Function0 function6, n81 n81Var, ux2 ux2Var, final int i2, final int i3) {
        int i4;
        Function0 function7;
        h71 h71Var2;
        fs4 fs4Var2;
        final n81 n81Var2;
        ux2 ux2Var2;
        int i5;
        ux2 ux2Var3;
        n81 n81Var3;
        int i6;
        fs4 fs4Var3;
        int i7;
        Object obj;
        boolean z2;
        px4 px4VarT;
        px4 px4VarT2;
        px4 px4VarT3;
        Object objT;
        boolean zH;
        Object obj2;
        Object obj3;
        int i8;
        boolean z3;
        Object obj4;
        boolean zG;
        Object obj5;
        Object objH;
        boolean zH2;
        hc1 hc1Var;
        Object obj6;
        boolean zH3;
        hc1 hc1Var2;
        Object obj7;
        Object objK;
        Object obj8;
        boolean zH4;
        Object obj9;
        boolean zH5;
        Object obj10;
        boolean zH6;
        byte b2;
        hc1 hc1Var3;
        Object obj11;
        boolean zH7;
        Object objK2;
        hc1 hc1Var4;
        vx6 vx6Var2;
        boolean z4;
        Object bjVar;
        vx6 vx6Var3;
        int i9;
        ux2 ux2Var4;
        boolean z5;
        boolean zH8;
        Object obj12;
        boolean zF;
        Object obj13;
        boolean zF2;
        byte b3;
        Object obj14;
        boolean z6;
        boolean zF3;
        Object obj15;
        final h71 h71Var3;
        final n81 n81Var4;
        boolean zH9;
        Object objK3;
        Object obj16;
        boolean zH10;
        final byte b4;
        Object obj17;
        boolean zH11;
        Object obj18;
        boolean zH12;
        Object obj19;
        boolean zH13;
        final byte b5;
        Object obj20;
        boolean zH14;
        final byte b6;
        Object obj21;
        boolean zH15;
        Object obj22;
        boolean zH16;
        byte b7;
        Object obj23;
        final o71 o71Var;
        Integer num;
        byte b8;
        boolean zH17;
        Object objK4;
        boolean zH18;
        Object objK5;
        i81 i81Var;
        ux2 ux2Var5;
        final ?? r9;
        boolean zH19;
        Object objK6;
        Object obj24;
        boolean zH20;
        Object obj25;
        boolean z7;
        boolean z8;
        Object obj26;
        j56 j56VarR;
        ux2 ux2Var6 = ux2Var;
        h71Var.getClass();
        int i10 = h71Var.m;
        function1.getClass();
        function2.getClass();
        function0.getClass();
        ux2Var6.Y(1363879709);
        int i11 = (ux2Var6.h(h71Var) ? 4 : 2) | i2 | (ux2Var6.g(z) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i11 |= ux2Var6.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i11 |= ux2Var6.h(function2) ? 2048 : 1024;
        }
        int i12 = i11 | (ux2Var6.h(function0) ? 16384 : 8192) | 196608 | (ux2Var6.h(function3) ? 1048576 : 524288);
        if ((i2 & 12582912) == 0) {
            i12 |= ux2Var6.h(function4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i12 |= ux2Var6.h(function5) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if ((i2 & 805306368) == 0) {
            i13 |= (i2 & 1073741824) == 0 ? ux2Var6.f(vx6Var) : ux2Var6.h(vx6Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i4 = i3 | (ux2Var6.h(function6) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= 16;
        }
        int i14 = i4;
        if (ux2Var6.N(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            ux2Var6.S();
            if ((i2 & 1) == 0 || ux2Var6.x()) {
                dl5 dl5Var = new dl5(new y01((byte) 25), (byte) 1);
                we8 we8VarA = id4.a(ux2Var6);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                i5 = i10;
                oe8 oe8VarT = g57.t(w86.a.b(n81.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                ux2Var3 = ux2Var;
                n81Var3 = (n81) oe8VarT;
                i6 = i14 & (-113);
                fs4Var3 = cs4.b;
            } else {
                ux2Var6.Q();
                int i15 = i14 & (-113);
                ux2Var3 = ux2Var6;
                i5 = i10;
                fs4Var3 = fs4Var;
                i6 = i15;
                n81Var3 = n81Var;
            }
            ux2Var3.q();
            Object obj27 = (i81) g57.g(n81Var3.s, ux2Var3).getValue();
            px4 px4VarT4 = h57.t(function4, ux2Var3);
            px4 px4VarT5 = h57.t(function5, ux2Var3);
            int i16 = i6 & 14;
            int i17 = i5;
            px4 px4VarT6 = h57.t(function6, ux2Var3);
            boolean zA1 = n81Var3.a1();
            i81 i81Var2 = (i81) n81Var3.s.m.getValue();
            h71 h71Var4 = i81Var2.a;
            if (h71Var4 == null) {
                i7 = i16;
                obj = obj27;
            } else {
                i7 = i16;
                String str = h71Var4.q;
                if (str == null) {
                    str = "";
                }
                obj = obj27;
                z2 = (i81Var2.e && i81Var2.f && im3.n(h71Var4.f954o, i81Var2.c) && str.equals(i81Var2.d)) ? false : true;
                px4VarT = h57.t(function1, ux2Var3);
                px4VarT2 = h57.t(function3, ux2Var3);
                px4VarT3 = h57.t(function2, ux2Var3);
                objT = h57.t(function0, ux2Var3);
                zH = ux2Var3.h(n81Var3) | ux2Var3.f(objT);
                Object objK7 = ux2Var3.K();
                obj2 = e01.a;
                obj3 = objK7;
                if (zH || objK7 == obj2) {
                    Object x8Var = new x8(n81Var3, objT, (byte) 23);
                    ux2Var3.g0(x8Var);
                    obj3 = x8Var;
                }
                Function0 function8 = (Function0) obj3;
                i8 = i13 & 112;
                if (i8 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object objK8 = ux2Var3.K();
                obj4 = objK8;
                if (z3 || objK8 == obj2) {
                    Object q71Var = new q71(z);
                    ux2Var3.g0(q71Var);
                    obj4 = q71Var;
                }
                Function0 function9 = (Function0) obj4;
                zG = ux2Var3.g(z2);
                Object objK9 = ux2Var3.K();
                obj5 = objK9;
                if (zG || objK9 == obj2) {
                    Object q71Var2 = new q71(z2);
                    ux2Var3.g0(q71Var2);
                    obj5 = q71Var2;
                }
                objH = nv1.H(function9, (Function0) obj5, function8, ux2Var3);
                et1.c((i13 >> 3) & 14, ux2Var3, z);
                zH2 = ux2Var3.h(n81Var3) | ux2Var3.h(h71Var);
                Object objK10 = ux2Var3.K();
                hc1Var = null;
                if (!zH2 || objK10 == obj2) {
                    Object f81Var = new f81(n81Var3, h71Var, hc1Var, (byte) 0);
                    ux2Var3.g0(f81Var);
                    obj6 = f81Var;
                } else {
                    obj6 = objK10;
                }
                ck3.i(h71Var, (hw2) obj6, ux2Var3);
                Integer numValueOf = Integer.valueOf(i17);
                zH3 = ux2Var3.h(n81Var3) | ux2Var3.h(h71Var);
                Object objK11 = ux2Var3.K();
                if (!zH3 || objK11 == obj2) {
                    hc1Var2 = null;
                    Object d81Var = new d81(n81Var3, h71Var, null);
                    ux2Var3.g0(d81Var);
                    obj7 = d81Var;
                } else {
                    hc1Var2 = null;
                    obj7 = objK11;
                }
                ck3.i(numValueOf, (hw2) obj7, ux2Var3);
                objK = ux2Var3.K();
                if (objK == obj2) {
                    Object l5Var = new l5(2, hc1Var2, (byte) 5);
                    ux2Var3.g0(l5Var);
                    obj8 = l5Var;
                } else {
                    obj8 = objK;
                }
                f88 f88Var = f88.a;
                ck3.i(f88Var, (hw2) obj8, ux2Var3);
                zH4 = ux2Var3.h(n81Var3) | ux2Var3.f(px4VarT4);
                Object objK12 = ux2Var3.K();
                if (!zH4 || objK12 == obj2) {
                    Object c81Var = new c81(n81Var3, px4VarT4, null, (byte) 1);
                    ux2Var3.g0(c81Var);
                    obj9 = c81Var;
                } else {
                    obj9 = objK12;
                }
                ck3.i(f88Var, (hw2) obj9, ux2Var3);
                zH5 = ux2Var3.h(n81Var3) | ux2Var3.f(px4VarT5);
                Object objK13 = ux2Var3.K();
                if (!zH5 || objK13 == obj2) {
                    Object c81Var2 = new c81(n81Var3, px4VarT5, null, (byte) 2);
                    ux2Var3.g0(c81Var2);
                    obj10 = c81Var2;
                } else {
                    obj10 = objK13;
                }
                ck3.i(f88Var, (hw2) obj10, ux2Var3);
                zH6 = ux2Var3.h(n81Var3) | ux2Var3.f(px4VarT6);
                Object objK14 = ux2Var3.K();
                if (!zH6 || objK14 == obj2) {
                    b2 = 0;
                    hc1Var3 = null;
                    Object c81Var3 = new c81(n81Var3, px4VarT6, hc1Var3, b2);
                    ux2Var3.g0(c81Var3);
                    obj11 = c81Var3;
                } else {
                    b2 = 0;
                    hc1Var3 = null;
                    obj11 = objK14;
                }
                ck3.i(f88Var, (hw2) obj11, ux2Var3);
                zH7 = ux2Var3.h(n81Var3) | ux2Var3.f(objT) | ux2Var3.f(px4VarT4);
                objK2 = ux2Var3.K();
                if (!zH7 || objK2 == obj2) {
                    hc1 hc1Var5 = hc1Var3;
                    objK2 = new j0((Object) n81Var3, objT, (Object) px4VarT4, hc1Var5, (byte) 18);
                    hc1Var4 = hc1Var5;
                    ux2Var3.g0(objK2);
                } else {
                    hc1Var4 = hc1Var3;
                }
                ck3.i(f88Var, (hw2) objK2, ux2Var3);
                if ((i13 & 1879048192) != 536870912) {
                    vx6Var2 = vx6Var;
                    byte b9 = ((i13 & 1073741824) == 0 && ux2Var3.h(vx6Var2)) ? (byte) 1 : b2;
                    z4 = ((((ux2Var3.f(objT) ? 1 : 0) | b9) | (ux2Var3.h(n81Var3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var3.h(objH) ? 1 : 0);
                    Object objK15 = ux2Var3.K();
                    if (z4 == 0 || objK15 == obj2) {
                        vx6Var3 = vx6Var;
                        ux2 ux2Var7 = ux2Var3;
                        i9 = 32;
                        bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                        ux2Var7.g0(bjVar);
                        ux2Var4 = ux2Var7;
                    } else {
                        vx6Var3 = vx6Var2;
                        bjVar = objK15;
                        ux2Var4 = ux2Var3;
                        i9 = 32;
                    }
                    ck3.i(vx6Var3, (hw2) bjVar, ux2Var4);
                    Integer numValueOf2 = Integer.valueOf(i17);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    if (i8 == i9) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zH8 = z5 | ux2Var4.h(n81Var3) | ux2Var4.h(h71Var);
                    Object objK16 = ux2Var4.K();
                    obj12 = objK16;
                    if (zH8 || objK16 == obj2) {
                        Object d81Var2 = new d81(z, n81Var3, h71Var, hc1Var4);
                        ux2Var4.g0(d81Var2);
                        obj12 = d81Var2;
                    }
                    ck3.h(numValueOf2, boolValueOf, (hw2) obj12, ux2Var4);
                    Boolean boolValueOf2 = Boolean.valueOf(zA1);
                    zF = ux2Var4.f(px4VarT) | ux2Var4.g(zA1);
                    Object objK17 = ux2Var4.K();
                    obj13 = objK17;
                    if (zF || objK17 == obj2) {
                        Object e81Var = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                        ux2Var4.g0(e81Var);
                        obj13 = e81Var;
                    }
                    ck3.i(boolValueOf2, (hw2) obj13, ux2Var4);
                    Boolean boolValueOf3 = Boolean.valueOf(obj.b);
                    zF2 = ux2Var4.f(r29) | ux2Var4.h(obj);
                    Object objK18 = ux2Var4.K();
                    if (!zF2 || objK18 == obj2) {
                        b3 = 4;
                        Object i9Var = new i9(px4VarT2, obj, hc1Var4, b3);
                        ux2Var4.g0(i9Var);
                        obj14 = i9Var;
                    } else {
                        b3 = 4;
                        obj14 = objK18;
                    }
                    ck3.i(boolValueOf3, (hw2) obj14, ux2Var4);
                    Boolean boolValueOf4 = Boolean.valueOf(z2);
                    z6 = z2;
                    zF3 = ux2Var4.f(px4VarT3) | ux2Var4.g(z6);
                    Object objK19 = ux2Var4.K();
                    obj15 = objK19;
                    if (zF3 || objK19 == obj2) {
                        Object e81Var2 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                        ux2Var4.g0(e81Var2);
                        obj15 = e81Var2;
                    }
                    ck3.i(boolValueOf4, (hw2) obj15, ux2Var4);
                    h71Var3 = obj.a;
                    if (h71Var3 == null) {
                        j56VarR = ux2Var4.r();
                        if (j56VarR != null) {
                            final byte b10 = 0;
                            final vx6 vx6Var4 = vx6Var3;
                            final n81 n81Var5 = n81Var3;
                            final fs4 fs4Var4 = fs4Var3;
                            j56VarR.d = new hw2() { // from class: o.r71
                                @Override // o.hw2
                                public final Object invoke(Object obj28, Object obj29) {
                                    byte b11 = b10;
                                    f88 f88Var2 = f88.a;
                                    int i18 = i3;
                                    int i19 = i2;
                                    switch (b11) {
                                        case 0:
                                            ((Integer) obj29).getClass();
                                            int iY = yo1.Y(i19 | 1);
                                            int iY2 = yo1.Y(i18);
                                            qf0.g(h71Var, z, function1, function2, function0, fs4Var4, function3, function4, function5, vx6Var4, function6, n81Var5, (ux2) obj28, iY, iY2);
                                            break;
                                        default:
                                            ((Integer) obj29).getClass();
                                            int iY3 = yo1.Y(i19 | 1);
                                            int iY4 = yo1.Y(i18);
                                            qf0.g(h71Var, z, function1, function2, function0, fs4Var4, function3, function4, function5, vx6Var4, function6, n81Var5, (ux2) obj28, iY3, iY4);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    h71Var2 = h71Var;
                    n81Var4 = n81Var3;
                    fs4 fs4Var5 = fs4Var3;
                    function7 = function6;
                    zH9 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                    objK3 = ux2Var4.K();
                    if (zH9 || objK3 == obj2) {
                        obj16 = objK3;
                        final byte b11 = 1;
                        Object obj28 = new Function0() { // from class: o.p71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b12 = b11;
                                byte b13 = 3;
                                byte b14 = 1;
                                f88 f88Var2 = f88.a;
                                byte b15 = 2;
                                hc1 hc1Var6 = null;
                                h71 h71Var5 = h71Var3;
                                n81 n81Var6 = n81Var4;
                                switch (b12) {
                                    case 0:
                                        h71Var5.getClass();
                                        Integer num2 = h71Var5.n;
                                        if (num2 != null) {
                                            if (num2.intValue() != n81Var6.n) {
                                                GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                                e27 e27Var = e27.a;
                                                if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                            im3.R(e8.n(n81Var6), null, null, new h0((Object) n81Var6, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                        } else {
                                                            n81Var6.Y0(e27Var);
                                                        }
                                                    } else {
                                                        ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                        n81Var6.Y0(e27Var);
                                                    }
                                                } else {
                                                    n81Var6.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var6.Y0(d27.a);
                                            }
                                        }
                                        break;
                                    case 1:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = false;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b15), 2);
                                        break;
                                    case 2:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b14), 2);
                                        break;
                                    default:
                                        h71Var5.getClass();
                                        n81Var6.B = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new ff(h71Var5, n81Var6, hc1Var6, b13), 2);
                                        n81Var6.W0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj28);
                        obj16 = obj28;
                    }
                    Function0 function10 = (Function0) obj16;
                    zH10 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                    Object objK20 = ux2Var4.K();
                    if (!zH10 || objK20 == obj2) {
                        b4 = 2;
                        Object obj29 = new Function0() { // from class: o.p71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b12 = b4;
                                byte b13 = 3;
                                byte b14 = 1;
                                f88 f88Var2 = f88.a;
                                byte b15 = 2;
                                hc1 hc1Var6 = null;
                                h71 h71Var5 = h71Var3;
                                n81 n81Var6 = n81Var4;
                                switch (b12) {
                                    case 0:
                                        h71Var5.getClass();
                                        Integer num2 = h71Var5.n;
                                        if (num2 != null) {
                                            if (num2.intValue() != n81Var6.n) {
                                                GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                                e27 e27Var = e27.a;
                                                if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                            im3.R(e8.n(n81Var6), null, null, new h0((Object) n81Var6, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                        } else {
                                                            n81Var6.Y0(e27Var);
                                                        }
                                                    } else {
                                                        ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                        n81Var6.Y0(e27Var);
                                                    }
                                                } else {
                                                    n81Var6.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var6.Y0(d27.a);
                                            }
                                        }
                                        break;
                                    case 1:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = false;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b15), 2);
                                        break;
                                    case 2:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b14), 2);
                                        break;
                                    default:
                                        h71Var5.getClass();
                                        n81Var6.B = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new ff(h71Var5, n81Var6, hc1Var6, b13), 2);
                                        n81Var6.W0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj29);
                        obj17 = obj29;
                    } else {
                        b4 = 2;
                        obj17 = objK20;
                    }
                    Function0 function11 = (Function0) obj17;
                    zH11 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                    Object objK21 = ux2Var4.K();
                    obj18 = objK21;
                    if (zH11 || objK21 == obj2) {
                        final byte b12 = 0;
                        Object obj30 = new Function0() { // from class: o.p71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b13 = b12;
                                byte b14 = 3;
                                byte b15 = 1;
                                f88 f88Var2 = f88.a;
                                byte b16 = 2;
                                hc1 hc1Var6 = null;
                                h71 h71Var5 = h71Var3;
                                n81 n81Var6 = n81Var4;
                                switch (b13) {
                                    case 0:
                                        h71Var5.getClass();
                                        Integer num2 = h71Var5.n;
                                        if (num2 != null) {
                                            if (num2.intValue() != n81Var6.n) {
                                                GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                                e27 e27Var = e27.a;
                                                if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                            im3.R(e8.n(n81Var6), null, null, new h0((Object) n81Var6, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                        } else {
                                                            n81Var6.Y0(e27Var);
                                                        }
                                                    } else {
                                                        ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                        n81Var6.Y0(e27Var);
                                                    }
                                                } else {
                                                    n81Var6.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var6.Y0(d27.a);
                                            }
                                        }
                                        break;
                                    case 1:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = false;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b16), 2);
                                        break;
                                    case 2:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b15), 2);
                                        break;
                                    default:
                                        h71Var5.getClass();
                                        n81Var6.B = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new ff(h71Var5, n81Var6, hc1Var6, b14), 2);
                                        n81Var6.W0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj30);
                        obj18 = obj30;
                    }
                    Function0 function12 = (Function0) obj18;
                    zH12 = ux2Var4.h(n81Var4);
                    Object objK22 = ux2Var4.K();
                    obj19 = objK22;
                    if (zH12 || objK22 == obj2) {
                        final byte b13 = 0;
                        Object obj31 = new Function0() { // from class: o.v71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                Object value;
                                byte b14 = b13;
                                f88 f88Var2 = f88.a;
                                n81 n81Var6 = n81Var4;
                                switch (b14) {
                                    case 0:
                                        l97 l97Var = n81Var6.r;
                                        do {
                                            value = l97Var.getValue();
                                        } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                        break;
                                    case 1:
                                        n81Var6.W0();
                                        break;
                                    default:
                                        n81Var6.V0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj31);
                        obj19 = obj31;
                    }
                    Function0 function13 = (Function0) obj19;
                    zH13 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                    Object objK23 = ux2Var4.K();
                    b5 = 3;
                    obj20 = objK23;
                    if (zH13 || objK23 == obj2) {
                        Object obj32 = new Function0() { // from class: o.p71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b14 = b5;
                                byte b15 = 3;
                                byte b16 = 1;
                                f88 f88Var2 = f88.a;
                                byte b17 = 2;
                                hc1 hc1Var6 = null;
                                h71 h71Var5 = h71Var3;
                                n81 n81Var6 = n81Var4;
                                switch (b14) {
                                    case 0:
                                        h71Var5.getClass();
                                        Integer num2 = h71Var5.n;
                                        if (num2 != null) {
                                            if (num2.intValue() != n81Var6.n) {
                                                GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                                e27 e27Var = e27.a;
                                                if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                    IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                    if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                        ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                        if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                            im3.R(e8.n(n81Var6), null, null, new h0((Object) n81Var6, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                        } else {
                                                            n81Var6.Y0(e27Var);
                                                        }
                                                    } else {
                                                        ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                        n81Var6.Y0(e27Var);
                                                    }
                                                } else {
                                                    n81Var6.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var6.Y0(d27.a);
                                            }
                                        }
                                        break;
                                    case 1:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = false;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b17), 2);
                                        break;
                                    case 2:
                                        h71Var5.getClass();
                                        n81Var6.z = Integer.valueOf(h71Var5.m);
                                        n81Var6.A = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new f81(n81Var6, h71Var5, hc1Var6, b16), 2);
                                        break;
                                    default:
                                        h71Var5.getClass();
                                        n81Var6.B = true;
                                        im3.R(e8.n(n81Var6), n81Var6.q, null, new ff(h71Var5, n81Var6, hc1Var6, b15), 2);
                                        n81Var6.W0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj32);
                        obj20 = obj32;
                    }
                    Function0 function14 = (Function0) obj20;
                    zH14 = ux2Var4.h(n81Var4);
                    Object objK24 = ux2Var4.K();
                    if (!zH14 || objK24 == obj2) {
                        b6 = 1;
                        Object obj33 = new Function0() { // from class: o.v71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                Object value;
                                byte b14 = b6;
                                f88 f88Var2 = f88.a;
                                n81 n81Var6 = n81Var4;
                                switch (b14) {
                                    case 0:
                                        l97 l97Var = n81Var6.r;
                                        do {
                                            value = l97Var.getValue();
                                        } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                        break;
                                    case 1:
                                        n81Var6.W0();
                                        break;
                                    default:
                                        n81Var6.V0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj33);
                        obj21 = obj33;
                    } else {
                        b6 = 1;
                        obj21 = objK24;
                    }
                    Function0 function15 = (Function0) obj21;
                    zH15 = ux2Var4.h(n81Var4);
                    Object objK25 = ux2Var4.K();
                    obj22 = objK25;
                    if (zH15 || objK25 == obj2) {
                        Object obj34 = new Function0() { // from class: o.v71
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                Object value;
                                byte b14 = b4;
                                f88 f88Var2 = f88.a;
                                n81 n81Var6 = n81Var4;
                                switch (b14) {
                                    case 0:
                                        l97 l97Var = n81Var6.r;
                                        do {
                                            value = l97Var.getValue();
                                        } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                        break;
                                    case 1:
                                        n81Var6.W0();
                                        break;
                                    default:
                                        n81Var6.V0();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var4.g0(obj34);
                        obj22 = obj34;
                    }
                    Function0 function16 = (Function0) obj22;
                    zH16 = ux2Var4.h(n81Var4);
                    Object objK26 = ux2Var4.K();
                    if (!zH16 || objK26 == obj2) {
                        b7 = 0;
                        Object a81Var = new a81(n81Var4, b7);
                        ux2Var4.g0(a81Var);
                        obj23 = a81Var;
                    } else {
                        b7 = 0;
                        obj23 = objK26;
                    }
                    o71Var = new o71(function10, function11, function12, function13, function14, function15, function16, (Function1) obj23);
                    num = h71Var2.n;
                    if (num == null && num.intValue() == n81Var4.n) {
                        b8 = b6;
                    } else {
                        b8 = b7;
                    }
                    zH17 = ux2Var4.h(n81Var4);
                    objK4 = ux2Var4.K();
                    if (zH17 || objK4 == obj2) {
                        objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                        ux2Var4.g0(objK4);
                    }
                    pu3 pu3Var = (pu3) objK4;
                    zH18 = ux2Var4.h(n81Var4);
                    objK5 = ux2Var4.K();
                    if (zH18 || objK5 == obj2) {
                        objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                        ux2Var4.g0(objK5);
                    }
                    i81Var = obj;
                    h(h71Var3, b8, z, i81Var, (Function1) pu3Var, (Function1) ((pu3) objK5), fs4Var5, o71Var, ux2Var4, 3670912 & (i13 << 3), 0);
                    ux2 ux2Var8 = ux2Var4;
                    fs4Var2 = fs4Var5;
                    ux2Var5 = ux2Var8;
                    if (i81Var.j) {
                        ux2Var5.W(955371436);
                        boolean zH21 = ux2Var5.h(n81Var4);
                        if (i7 == b3) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = zH21 | z7;
                        Object objK27 = ux2Var5.K();
                        obj26 = objK27;
                        if (z8 || objK27 == obj2) {
                            Object x8Var2 = new x8(n81Var4, function7, (byte) 24);
                            ux2Var5.g0(x8Var2);
                            obj26 = x8Var2;
                        }
                        r9 = 0;
                        j51.n((Function0) obj26, ux2Var5, 0);
                        ux2Var5.p(false);
                    } else {
                        r9 = 0;
                        ux2Var5.W(955549221);
                        ux2Var5.p(false);
                    }
                    if (i81Var.k) {
                        ux2Var5.W(955619560);
                        String strZ = m77.z(R.string.contact_remove_dialog_title, ux2Var5);
                        String strZ2 = m77.z(R.string.contact_remove_dialog_message, ux2Var5);
                        zH19 = ux2Var5.h(o71Var);
                        objK6 = ux2Var5.K();
                        if (zH19 || objK6 == obj2) {
                            obj24 = objK6;
                            Object obj35 = new Function0() { // from class: o.b81
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b14 = r9;
                                    f88 f88Var2 = f88.a;
                                    o71 o71Var2 = o71Var;
                                    switch (b14) {
                                        case 0:
                                            o71Var2.e.a();
                                            break;
                                        default:
                                            o71Var2.f.a();
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var5.g0(obj35);
                            obj24 = obj35;
                        }
                        Function0 function17 = (Function0) obj24;
                        zH20 = ux2Var5.h(o71Var);
                        Object objK28 = ux2Var5.K();
                        obj25 = objK28;
                        if (zH20 || objK28 == obj2) {
                            final byte b14 = 1;
                            Object obj36 = new Function0() { // from class: o.b81
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b15 = b14;
                                    f88 f88Var2 = f88.a;
                                    o71 o71Var2 = o71Var;
                                    switch (b15) {
                                        case 0:
                                            o71Var2.e.a();
                                            break;
                                        default:
                                            o71Var2.f.a();
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var5.g0(obj36);
                            obj25 = obj36;
                        }
                        yo1.q(strZ, strZ2, "TVTA-devicesScreen-removeContactDialog", function17, (Function0) obj25, null, ux2Var5, 384);
                        ux2Var5.p(r9);
                    } else {
                        ux2Var5.W(956108709);
                        ux2Var5.p(r9);
                    }
                    n81Var2 = n81Var4;
                    ux2Var2 = ux2Var5;
                } else {
                    vx6Var2 = vx6Var;
                }
                z4 = ((((ux2Var3.f(objT) ? 1 : 0) | b9) | (ux2Var3.h(n81Var3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var3.h(objH) ? 1 : 0);
                Object objK110 = ux2Var3.K();
                if (z4 == 0) {
                    vx6Var3 = vx6Var;
                    ux2 ux2Var9 = ux2Var3;
                    i9 = 32;
                    bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                    ux2Var9.g0(bjVar);
                    ux2Var4 = ux2Var9;
                } else {
                    vx6Var3 = vx6Var;
                    ux2 ux2Var10 = ux2Var3;
                    i9 = 32;
                    bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                    ux2Var10.g0(bjVar);
                    ux2Var4 = ux2Var10;
                }
                ck3.i(vx6Var3, (hw2) bjVar, ux2Var4);
                Integer numValueOf3 = Integer.valueOf(i17);
                Boolean boolValueOf5 = Boolean.valueOf(z);
                if (i8 == i9) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zH8 = z5 | ux2Var4.h(n81Var3) | ux2Var4.h(h71Var);
                Object objK111 = ux2Var4.K();
                obj12 = objK111;
                if (zH8) {
                    Object d81Var3 = new d81(z, n81Var3, h71Var, hc1Var4);
                    ux2Var4.g0(d81Var3);
                    obj12 = d81Var3;
                } else {
                    Object d81Var4 = new d81(z, n81Var3, h71Var, hc1Var4);
                    ux2Var4.g0(d81Var4);
                    obj12 = d81Var4;
                }
                ck3.h(numValueOf3, boolValueOf5, (hw2) obj12, ux2Var4);
                Boolean boolValueOf6 = Boolean.valueOf(zA1);
                zF = ux2Var4.f(px4VarT) | ux2Var4.g(zA1);
                Object objK112 = ux2Var4.K();
                obj13 = objK112;
                if (zF) {
                    Object e81Var3 = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                    ux2Var4.g0(e81Var3);
                    obj13 = e81Var3;
                } else {
                    Object e81Var4 = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                    ux2Var4.g0(e81Var4);
                    obj13 = e81Var4;
                }
                ck3.i(boolValueOf6, (hw2) obj13, ux2Var4);
                Boolean boolValueOf7 = Boolean.valueOf(obj.b);
                zF2 = ux2Var4.f(r29) | ux2Var4.h(obj);
                Object objK113 = ux2Var4.K();
                if (zF2) {
                    b3 = 4;
                    Object i9Var2 = new i9(px4VarT2, obj, hc1Var4, b3);
                    ux2Var4.g0(i9Var2);
                    obj14 = i9Var2;
                } else {
                    b3 = 4;
                    Object i9Var3 = new i9(px4VarT2, obj, hc1Var4, b3);
                    ux2Var4.g0(i9Var3);
                    obj14 = i9Var3;
                }
                ck3.i(boolValueOf7, (hw2) obj14, ux2Var4);
                Boolean boolValueOf8 = Boolean.valueOf(z2);
                z6 = z2;
                zF3 = ux2Var4.f(px4VarT3) | ux2Var4.g(z6);
                Object objK114 = ux2Var4.K();
                obj15 = objK114;
                if (zF3) {
                    Object e81Var5 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                    ux2Var4.g0(e81Var5);
                    obj15 = e81Var5;
                } else {
                    Object e81Var6 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                    ux2Var4.g0(e81Var6);
                    obj15 = e81Var6;
                }
                ck3.i(boolValueOf8, (hw2) obj15, ux2Var4);
                h71Var3 = obj.a;
                if (h71Var3 == null) {
                    j56VarR = ux2Var4.r();
                    if (j56VarR != null) {
                        final byte b15 = 0;
                        final vx6 vx6Var5 = vx6Var3;
                        final n81 n81Var6 = n81Var3;
                        final fs4 fs4Var6 = fs4Var3;
                        j56VarR.d = new hw2() { // from class: o.r71
                            @Override // o.hw2
                            public final Object invoke(Object obj210, Object obj211) {
                                byte b16 = b15;
                                f88 f88Var2 = f88.a;
                                int i18 = i3;
                                int i19 = i2;
                                switch (b16) {
                                    case 0:
                                        ((Integer) obj211).getClass();
                                        int iY = yo1.Y(i19 | 1);
                                        int iY2 = yo1.Y(i18);
                                        qf0.g(h71Var, z, function1, function2, function0, fs4Var6, function3, function4, function5, vx6Var5, function6, n81Var6, (ux2) obj210, iY, iY2);
                                        break;
                                    default:
                                        ((Integer) obj211).getClass();
                                        int iY3 = yo1.Y(i19 | 1);
                                        int iY4 = yo1.Y(i18);
                                        qf0.g(h71Var, z, function1, function2, function0, fs4Var6, function3, function4, function5, vx6Var5, function6, n81Var6, (ux2) obj210, iY3, iY4);
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        return;
                    }
                    return;
                }
                h71Var2 = h71Var;
                n81Var4 = n81Var3;
                fs4 fs4Var7 = fs4Var3;
                function7 = function6;
                zH9 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                objK3 = ux2Var4.K();
                if (zH9) {
                    obj16 = objK3;
                    final byte b16 = 1;
                    Object obj210 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b17 = b16;
                            byte b18 = 3;
                            byte b19 = 1;
                            f88 f88Var2 = f88.a;
                            byte b110 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b17) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b110), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b19), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b18), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj210);
                    obj16 = obj210;
                } else {
                    obj16 = objK3;
                    final byte b17 = 1;
                    Object obj211 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b18 = b17;
                            byte b19 = 3;
                            byte b110 = 1;
                            f88 f88Var2 = f88.a;
                            byte b111 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b18) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b111), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b110), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b19), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj211);
                    obj16 = obj211;
                }
                Function0 function18 = (Function0) obj16;
                zH10 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                Object objK29 = ux2Var4.K();
                if (zH10) {
                    b4 = 2;
                    Object obj212 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b18 = b4;
                            byte b19 = 3;
                            byte b110 = 1;
                            f88 f88Var2 = f88.a;
                            byte b111 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b18) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b111), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b110), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b19), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj212);
                    obj17 = obj212;
                } else {
                    b4 = 2;
                    Object obj213 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b18 = b4;
                            byte b19 = 3;
                            byte b110 = 1;
                            f88 f88Var2 = f88.a;
                            byte b111 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b18) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b111), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b110), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b19), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj213);
                    obj17 = obj213;
                }
                Function0 function19 = (Function0) obj17;
                zH11 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                Object objK210 = ux2Var4.K();
                obj18 = objK210;
                if (zH11) {
                    final byte b18 = 0;
                    Object obj37 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b19 = b18;
                            byte b110 = 3;
                            byte b111 = 1;
                            f88 f88Var2 = f88.a;
                            byte b112 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b19) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b112), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b111), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b110), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj37);
                    obj18 = obj37;
                } else {
                    final byte b19 = 0;
                    Object obj38 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b110 = b19;
                            byte b111 = 3;
                            byte b112 = 1;
                            f88 f88Var2 = f88.a;
                            byte b113 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b110) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b113), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b112), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b111), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj38);
                    obj18 = obj38;
                }
                Function0 function110 = (Function0) obj18;
                zH12 = ux2Var4.h(n81Var4);
                Object objK211 = ux2Var4.K();
                obj19 = objK211;
                if (zH12) {
                    final byte b110 = 0;
                    Object obj39 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b111 = b110;
                            f88 f88Var2 = f88.a;
                            n81 n81Var7 = n81Var4;
                            switch (b111) {
                                case 0:
                                    l97 l97Var = n81Var7.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var7.W0();
                                    break;
                                default:
                                    n81Var7.V0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj39);
                    obj19 = obj39;
                } else {
                    final byte b111 = 0;
                    Object obj310 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b112 = b111;
                            f88 f88Var2 = f88.a;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    l97 l97Var = n81Var7.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var7.W0();
                                    break;
                                default:
                                    n81Var7.V0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj310);
                    obj19 = obj310;
                }
                Function0 function111 = (Function0) obj19;
                zH13 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                Object objK212 = ux2Var4.K();
                b5 = 3;
                obj20 = objK212;
                if (zH13) {
                    Object obj311 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b112 = b5;
                            byte b113 = 3;
                            byte b114 = 1;
                            f88 f88Var2 = f88.a;
                            byte b115 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b115), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b114), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b113), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj311);
                    obj20 = obj311;
                } else {
                    Object obj312 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b112 = b5;
                            byte b113 = 3;
                            byte b114 = 1;
                            f88 f88Var2 = f88.a;
                            byte b115 = 2;
                            hc1 hc1Var6 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var7.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var7), null, null, new h0((Object) n81Var7, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var6, (byte) 28), 3);
                                                    } else {
                                                        n81Var7.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var7.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var7.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var7.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = false;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b115), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var7.z = Integer.valueOf(h71Var5.m);
                                    n81Var7.A = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new f81(n81Var7, h71Var5, hc1Var6, b114), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var7.B = true;
                                    im3.R(e8.n(n81Var7), n81Var7.q, null, new ff(h71Var5, n81Var7, hc1Var6, b113), 2);
                                    n81Var7.W0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj312);
                    obj20 = obj312;
                }
                Function0 function112 = (Function0) obj20;
                zH14 = ux2Var4.h(n81Var4);
                Object objK213 = ux2Var4.K();
                if (zH14) {
                    b6 = 1;
                    Object obj313 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b112 = b6;
                            f88 f88Var2 = f88.a;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    l97 l97Var = n81Var7.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var7.W0();
                                    break;
                                default:
                                    n81Var7.V0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj313);
                    obj21 = obj313;
                } else {
                    b6 = 1;
                    Object obj314 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b112 = b6;
                            f88 f88Var2 = f88.a;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    l97 l97Var = n81Var7.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var7.W0();
                                    break;
                                default:
                                    n81Var7.V0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj314);
                    obj21 = obj314;
                }
                Function0 function113 = (Function0) obj21;
                zH15 = ux2Var4.h(n81Var4);
                Object objK214 = ux2Var4.K();
                obj22 = objK214;
                if (zH15) {
                    Object obj315 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b112 = b4;
                            f88 f88Var2 = f88.a;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    l97 l97Var = n81Var7.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var7.W0();
                                    break;
                                default:
                                    n81Var7.V0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj315);
                    obj22 = obj315;
                } else {
                    Object obj316 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b112 = b4;
                            f88 f88Var2 = f88.a;
                            n81 n81Var7 = n81Var4;
                            switch (b112) {
                                case 0:
                                    l97 l97Var = n81Var7.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var7.W0();
                                    break;
                                default:
                                    n81Var7.V0();
                                    break;
                            }
                            return f88Var2;
                        }
                    };
                    ux2Var4.g0(obj316);
                    obj22 = obj316;
                }
                Function0 function114 = (Function0) obj22;
                zH16 = ux2Var4.h(n81Var4);
                Object objK215 = ux2Var4.K();
                if (zH16) {
                    b7 = 0;
                    Object a81Var2 = new a81(n81Var4, b7);
                    ux2Var4.g0(a81Var2);
                    obj23 = a81Var2;
                } else {
                    b7 = 0;
                    Object a81Var3 = new a81(n81Var4, b7);
                    ux2Var4.g0(a81Var3);
                    obj23 = a81Var3;
                }
                o71Var = new o71(function18, function19, function110, function111, function112, function113, function114, (Function1) obj23);
                num = h71Var2.n;
                if (num == null) {
                    b8 = b7;
                } else {
                    b8 = b7;
                }
                zH17 = ux2Var4.h(n81Var4);
                objK4 = ux2Var4.K();
                if (zH17) {
                    objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                    ux2Var4.g0(objK4);
                } else {
                    objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                    ux2Var4.g0(objK4);
                }
                pu3 pu3Var2 = (pu3) objK4;
                zH18 = ux2Var4.h(n81Var4);
                objK5 = ux2Var4.K();
                if (zH18) {
                    objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                    ux2Var4.g0(objK5);
                } else {
                    objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                    ux2Var4.g0(objK5);
                }
                i81Var = obj;
                h(h71Var3, b8, z, i81Var, (Function1) pu3Var2, (Function1) ((pu3) objK5), fs4Var7, o71Var, ux2Var4, 3670912 & (i13 << 3), 0);
                ux2 ux2Var11 = ux2Var4;
                fs4Var2 = fs4Var7;
                ux2Var5 = ux2Var11;
                if (i81Var.j) {
                    ux2Var5.W(955371436);
                    boolean zH22 = ux2Var5.h(n81Var4);
                    if (i7 == b3) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zH22 | z7;
                    Object objK216 = ux2Var5.K();
                    obj26 = objK216;
                    if (z8) {
                        Object x8Var3 = new x8(n81Var4, function7, (byte) 24);
                        ux2Var5.g0(x8Var3);
                        obj26 = x8Var3;
                    } else {
                        Object x8Var4 = new x8(n81Var4, function7, (byte) 24);
                        ux2Var5.g0(x8Var4);
                        obj26 = x8Var4;
                    }
                    r9 = 0;
                    j51.n((Function0) obj26, ux2Var5, 0);
                    ux2Var5.p(false);
                } else {
                    r9 = 0;
                    ux2Var5.W(955549221);
                    ux2Var5.p(false);
                }
                if (i81Var.k) {
                    ux2Var5.W(955619560);
                    String strZ3 = m77.z(R.string.contact_remove_dialog_title, ux2Var5);
                    String strZ4 = m77.z(R.string.contact_remove_dialog_message, ux2Var5);
                    zH19 = ux2Var5.h(o71Var);
                    objK6 = ux2Var5.K();
                    if (zH19) {
                        obj24 = objK6;
                        Object obj317 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b112 = r9;
                                f88 f88Var2 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b112) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var5.g0(obj317);
                        obj24 = obj317;
                    } else {
                        obj24 = objK6;
                        Object obj318 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b112 = r9;
                                f88 f88Var2 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b112) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var5.g0(obj318);
                        obj24 = obj318;
                    }
                    Function0 function115 = (Function0) obj24;
                    zH20 = ux2Var5.h(o71Var);
                    Object objK217 = ux2Var5.K();
                    obj25 = objK217;
                    if (zH20) {
                        final byte b112 = 1;
                        Object obj319 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b113 = b112;
                                f88 f88Var2 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b113) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var5.g0(obj319);
                        obj25 = obj319;
                    } else {
                        final byte b113 = 1;
                        Object obj3110 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b114 = b113;
                                f88 f88Var2 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b114) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var2;
                            }
                        };
                        ux2Var5.g0(obj3110);
                        obj25 = obj3110;
                    }
                    yo1.q(strZ3, strZ4, "TVTA-devicesScreen-removeContactDialog", function115, (Function0) obj25, null, ux2Var5, 384);
                    ux2Var5.p(r9);
                } else {
                    ux2Var5.W(956108709);
                    ux2Var5.p(r9);
                }
                n81Var2 = n81Var4;
                ux2Var2 = ux2Var5;
            }
            px4VarT = h57.t(function1, ux2Var3);
            px4VarT2 = h57.t(function3, ux2Var3);
            px4VarT3 = h57.t(function2, ux2Var3);
            objT = h57.t(function0, ux2Var3);
            zH = ux2Var3.h(n81Var3) | ux2Var3.f(objT);
            Object objK30 = ux2Var3.K();
            obj2 = e01.a;
            obj3 = objK30;
            if (zH) {
                Object x8Var5 = new x8(n81Var3, objT, (byte) 23);
                ux2Var3.g0(x8Var5);
                obj3 = x8Var5;
            } else {
                Object x8Var6 = new x8(n81Var3, objT, (byte) 23);
                ux2Var3.g0(x8Var6);
                obj3 = x8Var6;
            }
            Function0 function20 = (Function0) obj3;
            i8 = i13 & 112;
            if (i8 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object objK31 = ux2Var3.K();
            obj4 = objK31;
            if (z3) {
                Object q71Var3 = new q71(z);
                ux2Var3.g0(q71Var3);
                obj4 = q71Var3;
            } else {
                Object q71Var4 = new q71(z);
                ux2Var3.g0(q71Var4);
                obj4 = q71Var4;
            }
            Function0 function21 = (Function0) obj4;
            zG = ux2Var3.g(z2);
            Object objK32 = ux2Var3.K();
            obj5 = objK32;
            if (zG) {
                Object q71Var5 = new q71(z2);
                ux2Var3.g0(q71Var5);
                obj5 = q71Var5;
            } else {
                Object q71Var6 = new q71(z2);
                ux2Var3.g0(q71Var6);
                obj5 = q71Var6;
            }
            objH = nv1.H(function21, (Function0) obj5, function20, ux2Var3);
            et1.c((i13 >> 3) & 14, ux2Var3, z);
            zH2 = ux2Var3.h(n81Var3) | ux2Var3.h(h71Var);
            Object objK115 = ux2Var3.K();
            hc1Var = null;
            if (zH2) {
                Object f81Var2 = new f81(n81Var3, h71Var, hc1Var, (byte) 0);
                ux2Var3.g0(f81Var2);
                obj6 = f81Var2;
            } else {
                Object f81Var3 = new f81(n81Var3, h71Var, hc1Var, (byte) 0);
                ux2Var3.g0(f81Var3);
                obj6 = f81Var3;
            }
            ck3.i(h71Var, (hw2) obj6, ux2Var3);
            Integer numValueOf4 = Integer.valueOf(i17);
            zH3 = ux2Var3.h(n81Var3) | ux2Var3.h(h71Var);
            Object objK116 = ux2Var3.K();
            if (zH3) {
                hc1Var2 = null;
                Object d81Var5 = new d81(n81Var3, h71Var, null);
                ux2Var3.g0(d81Var5);
                obj7 = d81Var5;
            } else {
                hc1Var2 = null;
                Object d81Var6 = new d81(n81Var3, h71Var, null);
                ux2Var3.g0(d81Var6);
                obj7 = d81Var6;
            }
            ck3.i(numValueOf4, (hw2) obj7, ux2Var3);
            objK = ux2Var3.K();
            if (objK == obj2) {
                Object l5Var2 = new l5(2, hc1Var2, (byte) 5);
                ux2Var3.g0(l5Var2);
                obj8 = l5Var2;
            } else {
                obj8 = objK;
            }
            f88 f88Var2 = f88.a;
            ck3.i(f88Var2, (hw2) obj8, ux2Var3);
            zH4 = ux2Var3.h(n81Var3) | ux2Var3.f(px4VarT4);
            Object objK117 = ux2Var3.K();
            if (zH4) {
                Object c81Var4 = new c81(n81Var3, px4VarT4, null, (byte) 1);
                ux2Var3.g0(c81Var4);
                obj9 = c81Var4;
            } else {
                Object c81Var5 = new c81(n81Var3, px4VarT4, null, (byte) 1);
                ux2Var3.g0(c81Var5);
                obj9 = c81Var5;
            }
            ck3.i(f88Var2, (hw2) obj9, ux2Var3);
            zH5 = ux2Var3.h(n81Var3) | ux2Var3.f(px4VarT5);
            Object objK118 = ux2Var3.K();
            if (zH5) {
                Object c81Var6 = new c81(n81Var3, px4VarT5, null, (byte) 2);
                ux2Var3.g0(c81Var6);
                obj10 = c81Var6;
            } else {
                Object c81Var7 = new c81(n81Var3, px4VarT5, null, (byte) 2);
                ux2Var3.g0(c81Var7);
                obj10 = c81Var7;
            }
            ck3.i(f88Var2, (hw2) obj10, ux2Var3);
            zH6 = ux2Var3.h(n81Var3) | ux2Var3.f(px4VarT6);
            Object objK119 = ux2Var3.K();
            if (zH6) {
                b2 = 0;
                hc1Var3 = null;
                Object c81Var8 = new c81(n81Var3, px4VarT6, hc1Var3, b2);
                ux2Var3.g0(c81Var8);
                obj11 = c81Var8;
            } else {
                b2 = 0;
                hc1Var3 = null;
                Object c81Var9 = new c81(n81Var3, px4VarT6, hc1Var3, b2);
                ux2Var3.g0(c81Var9);
                obj11 = c81Var9;
            }
            ck3.i(f88Var2, (hw2) obj11, ux2Var3);
            zH7 = ux2Var3.h(n81Var3) | ux2Var3.f(objT) | ux2Var3.f(px4VarT4);
            objK2 = ux2Var3.K();
            if (zH7) {
                hc1 hc1Var6 = hc1Var3;
                objK2 = new j0((Object) n81Var3, objT, (Object) px4VarT4, hc1Var6, (byte) 18);
                hc1Var4 = hc1Var6;
                ux2Var3.g0(objK2);
            } else {
                hc1 hc1Var7 = hc1Var3;
                objK2 = new j0((Object) n81Var3, objT, (Object) px4VarT4, hc1Var7, (byte) 18);
                hc1Var4 = hc1Var7;
                ux2Var3.g0(objK2);
            }
            ck3.i(f88Var2, (hw2) objK2, ux2Var3);
            if ((i13 & 1879048192) != 536870912) {
                vx6Var2 = vx6Var;
                if ((i13 & 1073741824) == 0) {
                }
                z4 = ((((ux2Var3.f(objT) ? 1 : 0) | b9) | (ux2Var3.h(n81Var3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var3.h(objH) ? 1 : 0);
                Object objK1110 = ux2Var3.K();
                if (z4 == 0) {
                    vx6Var3 = vx6Var;
                    ux2 ux2Var12 = ux2Var3;
                    i9 = 32;
                    bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                    ux2Var12.g0(bjVar);
                    ux2Var4 = ux2Var12;
                } else {
                    vx6Var3 = vx6Var;
                    ux2 ux2Var13 = ux2Var3;
                    i9 = 32;
                    bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                    ux2Var13.g0(bjVar);
                    ux2Var4 = ux2Var13;
                }
                ck3.i(vx6Var3, (hw2) bjVar, ux2Var4);
                Integer numValueOf5 = Integer.valueOf(i17);
                Boolean boolValueOf9 = Boolean.valueOf(z);
                if (i8 == i9) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zH8 = z5 | ux2Var4.h(n81Var3) | ux2Var4.h(h71Var);
                Object objK1111 = ux2Var4.K();
                obj12 = objK1111;
                if (zH8) {
                    Object d81Var7 = new d81(z, n81Var3, h71Var, hc1Var4);
                    ux2Var4.g0(d81Var7);
                    obj12 = d81Var7;
                } else {
                    Object d81Var8 = new d81(z, n81Var3, h71Var, hc1Var4);
                    ux2Var4.g0(d81Var8);
                    obj12 = d81Var8;
                }
                ck3.h(numValueOf5, boolValueOf9, (hw2) obj12, ux2Var4);
                Boolean boolValueOf10 = Boolean.valueOf(zA1);
                zF = ux2Var4.f(px4VarT) | ux2Var4.g(zA1);
                Object objK1112 = ux2Var4.K();
                obj13 = objK1112;
                if (zF) {
                    Object e81Var7 = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                    ux2Var4.g0(e81Var7);
                    obj13 = e81Var7;
                } else {
                    Object e81Var8 = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                    ux2Var4.g0(e81Var8);
                    obj13 = e81Var8;
                }
                ck3.i(boolValueOf10, (hw2) obj13, ux2Var4);
                Boolean boolValueOf11 = Boolean.valueOf(obj.b);
                zF2 = ux2Var4.f(r29) | ux2Var4.h(obj);
                Object objK1113 = ux2Var4.K();
                if (zF2) {
                    b3 = 4;
                    Object i9Var4 = new i9(px4VarT2, obj, hc1Var4, b3);
                    ux2Var4.g0(i9Var4);
                    obj14 = i9Var4;
                } else {
                    b3 = 4;
                    Object i9Var5 = new i9(px4VarT2, obj, hc1Var4, b3);
                    ux2Var4.g0(i9Var5);
                    obj14 = i9Var5;
                }
                ck3.i(boolValueOf11, (hw2) obj14, ux2Var4);
                Boolean boolValueOf12 = Boolean.valueOf(z2);
                z6 = z2;
                zF3 = ux2Var4.f(px4VarT3) | ux2Var4.g(z6);
                Object objK1114 = ux2Var4.K();
                obj15 = objK1114;
                if (zF3) {
                    Object e81Var9 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                    ux2Var4.g0(e81Var9);
                    obj15 = e81Var9;
                } else {
                    Object e81Var10 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                    ux2Var4.g0(e81Var10);
                    obj15 = e81Var10;
                }
                ck3.i(boolValueOf12, (hw2) obj15, ux2Var4);
                h71Var3 = obj.a;
                if (h71Var3 == null) {
                    j56VarR = ux2Var4.r();
                    if (j56VarR != null) {
                        final byte b114 = 0;
                        final vx6 vx6Var6 = vx6Var3;
                        final n81 n81Var7 = n81Var3;
                        final fs4 fs4Var8 = fs4Var3;
                        j56VarR.d = new hw2() { // from class: o.r71
                            @Override // o.hw2
                            public final Object invoke(Object obj214, Object obj215) {
                                byte b115 = b114;
                                f88 f88Var3 = f88.a;
                                int i18 = i3;
                                int i19 = i2;
                                switch (b115) {
                                    case 0:
                                        ((Integer) obj215).getClass();
                                        int iY = yo1.Y(i19 | 1);
                                        int iY2 = yo1.Y(i18);
                                        qf0.g(h71Var, z, function1, function2, function0, fs4Var8, function3, function4, function5, vx6Var6, function6, n81Var7, (ux2) obj214, iY, iY2);
                                        break;
                                    default:
                                        ((Integer) obj215).getClass();
                                        int iY3 = yo1.Y(i19 | 1);
                                        int iY4 = yo1.Y(i18);
                                        qf0.g(h71Var, z, function1, function2, function0, fs4Var8, function3, function4, function5, vx6Var6, function6, n81Var7, (ux2) obj214, iY3, iY4);
                                        break;
                                }
                                return f88Var3;
                            }
                        };
                        return;
                    }
                    return;
                }
                h71Var2 = h71Var;
                n81Var4 = n81Var3;
                fs4 fs4Var9 = fs4Var3;
                function7 = function6;
                zH9 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                objK3 = ux2Var4.K();
                if (zH9) {
                    obj16 = objK3;
                    final byte b115 = 1;
                    Object obj214 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b116 = b115;
                            byte b117 = 3;
                            byte b118 = 1;
                            f88 f88Var3 = f88.a;
                            byte b119 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b116) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b119), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b118), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b117), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj214);
                    obj16 = obj214;
                } else {
                    obj16 = objK3;
                    final byte b116 = 1;
                    Object obj215 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b117 = b116;
                            byte b118 = 3;
                            byte b119 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1110 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b117) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1110), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b119), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b118), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj215);
                    obj16 = obj215;
                }
                Function0 function116 = (Function0) obj16;
                zH10 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                Object objK218 = ux2Var4.K();
                if (zH10) {
                    b4 = 2;
                    Object obj216 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b117 = b4;
                            byte b118 = 3;
                            byte b119 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1110 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b117) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1110), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b119), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b118), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj216);
                    obj17 = obj216;
                } else {
                    b4 = 2;
                    Object obj217 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b117 = b4;
                            byte b118 = 3;
                            byte b119 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1110 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b117) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1110), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b119), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b118), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj217);
                    obj17 = obj217;
                }
                Function0 function117 = (Function0) obj17;
                zH11 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                Object objK219 = ux2Var4.K();
                obj18 = objK219;
                if (zH11) {
                    final byte b117 = 0;
                    Object obj320 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b118 = b117;
                            byte b119 = 3;
                            byte b1110 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1111 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b118) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1111), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1110), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b119), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj320);
                    obj18 = obj320;
                } else {
                    final byte b118 = 0;
                    Object obj321 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b119 = b118;
                            byte b1110 = 3;
                            byte b1111 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1112 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b119) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1112), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1111), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b1110), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj321);
                    obj18 = obj321;
                }
                Function0 function118 = (Function0) obj18;
                zH12 = ux2Var4.h(n81Var4);
                Object objK2110 = ux2Var4.K();
                obj19 = objK2110;
                if (zH12) {
                    final byte b119 = 0;
                    Object obj3111 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b1110 = b119;
                            f88 f88Var3 = f88.a;
                            n81 n81Var8 = n81Var4;
                            switch (b1110) {
                                case 0:
                                    l97 l97Var = n81Var8.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var8.W0();
                                    break;
                                default:
                                    n81Var8.V0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3111);
                    obj19 = obj3111;
                } else {
                    final byte b1110 = 0;
                    Object obj3112 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b1111 = b1110;
                            f88 f88Var3 = f88.a;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    l97 l97Var = n81Var8.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var8.W0();
                                    break;
                                default:
                                    n81Var8.V0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3112);
                    obj19 = obj3112;
                }
                Function0 function119 = (Function0) obj19;
                zH13 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
                Object objK2111 = ux2Var4.K();
                b5 = 3;
                obj20 = objK2111;
                if (zH13) {
                    Object obj3113 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b1111 = b5;
                            byte b1112 = 3;
                            byte b1113 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1114 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1114), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1113), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b1112), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3113);
                    obj20 = obj3113;
                } else {
                    Object obj3114 = new Function0() { // from class: o.p71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b1111 = b5;
                            byte b1112 = 3;
                            byte b1113 = 1;
                            f88 f88Var3 = f88.a;
                            byte b1114 = 2;
                            hc1 hc1Var8 = null;
                            h71 h71Var5 = h71Var3;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    h71Var5.getClass();
                                    Integer num2 = h71Var5.n;
                                    if (num2 != null) {
                                        if (num2.intValue() != n81Var8.n) {
                                            GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                            e27 e27Var = e27.a;
                                            if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                                IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                                if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                    ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                    if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                        im3.R(e8.n(n81Var8), null, null, new h0((Object) n81Var8, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                    } else {
                                                        n81Var8.Y0(e27Var);
                                                    }
                                                } else {
                                                    ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                    n81Var8.Y0(e27Var);
                                                }
                                            } else {
                                                n81Var8.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var8.Y0(d27.a);
                                        }
                                    }
                                    break;
                                case 1:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = false;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1114), 2);
                                    break;
                                case 2:
                                    h71Var5.getClass();
                                    n81Var8.z = Integer.valueOf(h71Var5.m);
                                    n81Var8.A = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new f81(n81Var8, h71Var5, hc1Var8, b1113), 2);
                                    break;
                                default:
                                    h71Var5.getClass();
                                    n81Var8.B = true;
                                    im3.R(e8.n(n81Var8), n81Var8.q, null, new ff(h71Var5, n81Var8, hc1Var8, b1112), 2);
                                    n81Var8.W0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3114);
                    obj20 = obj3114;
                }
                Function0 function1110 = (Function0) obj20;
                zH14 = ux2Var4.h(n81Var4);
                Object objK2112 = ux2Var4.K();
                if (zH14) {
                    b6 = 1;
                    Object obj3115 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b1111 = b6;
                            f88 f88Var3 = f88.a;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    l97 l97Var = n81Var8.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var8.W0();
                                    break;
                                default:
                                    n81Var8.V0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3115);
                    obj21 = obj3115;
                } else {
                    b6 = 1;
                    Object obj3116 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b1111 = b6;
                            f88 f88Var3 = f88.a;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    l97 l97Var = n81Var8.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var8.W0();
                                    break;
                                default:
                                    n81Var8.V0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3116);
                    obj21 = obj3116;
                }
                Function0 function1111 = (Function0) obj21;
                zH15 = ux2Var4.h(n81Var4);
                Object objK2113 = ux2Var4.K();
                obj22 = objK2113;
                if (zH15) {
                    Object obj3117 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b1111 = b4;
                            f88 f88Var3 = f88.a;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    l97 l97Var = n81Var8.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var8.W0();
                                    break;
                                default:
                                    n81Var8.V0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3117);
                    obj22 = obj3117;
                } else {
                    Object obj3118 = new Function0() { // from class: o.v71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            Object value;
                            byte b1111 = b4;
                            f88 f88Var3 = f88.a;
                            n81 n81Var8 = n81Var4;
                            switch (b1111) {
                                case 0:
                                    l97 l97Var = n81Var8.r;
                                    do {
                                        value = l97Var.getValue();
                                    } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                    break;
                                case 1:
                                    n81Var8.W0();
                                    break;
                                default:
                                    n81Var8.V0();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var4.g0(obj3118);
                    obj22 = obj3118;
                }
                Function0 function1112 = (Function0) obj22;
                zH16 = ux2Var4.h(n81Var4);
                Object objK2114 = ux2Var4.K();
                if (zH16) {
                    b7 = 0;
                    Object a81Var4 = new a81(n81Var4, b7);
                    ux2Var4.g0(a81Var4);
                    obj23 = a81Var4;
                } else {
                    b7 = 0;
                    Object a81Var5 = new a81(n81Var4, b7);
                    ux2Var4.g0(a81Var5);
                    obj23 = a81Var5;
                }
                o71Var = new o71(function116, function117, function118, function119, function1110, function1111, function1112, (Function1) obj23);
                num = h71Var2.n;
                if (num == null) {
                    b8 = b7;
                } else {
                    b8 = b7;
                }
                zH17 = ux2Var4.h(n81Var4);
                objK4 = ux2Var4.K();
                if (zH17) {
                    objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                    ux2Var4.g0(objK4);
                } else {
                    objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                    ux2Var4.g0(objK4);
                }
                pu3 pu3Var3 = (pu3) objK4;
                zH18 = ux2Var4.h(n81Var4);
                objK5 = ux2Var4.K();
                if (zH18) {
                    objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                    ux2Var4.g0(objK5);
                } else {
                    objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                    ux2Var4.g0(objK5);
                }
                i81Var = obj;
                h(h71Var3, b8, z, i81Var, (Function1) pu3Var3, (Function1) ((pu3) objK5), fs4Var9, o71Var, ux2Var4, 3670912 & (i13 << 3), 0);
                ux2 ux2Var14 = ux2Var4;
                fs4Var2 = fs4Var9;
                ux2Var5 = ux2Var14;
                if (i81Var.j) {
                    ux2Var5.W(955371436);
                    boolean zH23 = ux2Var5.h(n81Var4);
                    if (i7 == b3) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zH23 | z7;
                    Object objK2115 = ux2Var5.K();
                    obj26 = objK2115;
                    if (z8) {
                        Object x8Var7 = new x8(n81Var4, function7, (byte) 24);
                        ux2Var5.g0(x8Var7);
                        obj26 = x8Var7;
                    } else {
                        Object x8Var8 = new x8(n81Var4, function7, (byte) 24);
                        ux2Var5.g0(x8Var8);
                        obj26 = x8Var8;
                    }
                    r9 = 0;
                    j51.n((Function0) obj26, ux2Var5, 0);
                    ux2Var5.p(false);
                } else {
                    r9 = 0;
                    ux2Var5.W(955549221);
                    ux2Var5.p(false);
                }
                if (i81Var.k) {
                    ux2Var5.W(955619560);
                    String strZ5 = m77.z(R.string.contact_remove_dialog_title, ux2Var5);
                    String strZ6 = m77.z(R.string.contact_remove_dialog_message, ux2Var5);
                    zH19 = ux2Var5.h(o71Var);
                    objK6 = ux2Var5.K();
                    if (zH19) {
                        obj24 = objK6;
                        Object obj3119 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b1111 = r9;
                                f88 f88Var3 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b1111) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var3;
                            }
                        };
                        ux2Var5.g0(obj3119);
                        obj24 = obj3119;
                    } else {
                        obj24 = objK6;
                        Object obj31110 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b1111 = r9;
                                f88 f88Var3 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b1111) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var3;
                            }
                        };
                        ux2Var5.g0(obj31110);
                        obj24 = obj31110;
                    }
                    Function0 function1113 = (Function0) obj24;
                    zH20 = ux2Var5.h(o71Var);
                    Object objK2116 = ux2Var5.K();
                    obj25 = objK2116;
                    if (zH20) {
                        final byte b1111 = 1;
                        Object obj31111 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b1112 = b1111;
                                f88 f88Var3 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b1112) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var3;
                            }
                        };
                        ux2Var5.g0(obj31111);
                        obj25 = obj31111;
                    } else {
                        final byte b1112 = 1;
                        Object obj31112 = new Function0() { // from class: o.b81
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                byte b1113 = b1112;
                                f88 f88Var3 = f88.a;
                                o71 o71Var2 = o71Var;
                                switch (b1113) {
                                    case 0:
                                        o71Var2.e.a();
                                        break;
                                    default:
                                        o71Var2.f.a();
                                        break;
                                }
                                return f88Var3;
                            }
                        };
                        ux2Var5.g0(obj31112);
                        obj25 = obj31112;
                    }
                    yo1.q(strZ5, strZ6, "TVTA-devicesScreen-removeContactDialog", function1113, (Function0) obj25, null, ux2Var5, 384);
                    ux2Var5.p(r9);
                } else {
                    ux2Var5.W(956108709);
                    ux2Var5.p(r9);
                }
                n81Var2 = n81Var4;
                ux2Var2 = ux2Var5;
            } else {
                vx6Var2 = vx6Var;
            }
            z4 = ((((ux2Var3.f(objT) ? 1 : 0) | b9) | (ux2Var3.h(n81Var3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var3.h(objH) ? 1 : 0);
            Object objK1115 = ux2Var3.K();
            if (z4 == 0) {
                vx6Var3 = vx6Var;
                ux2 ux2Var15 = ux2Var3;
                i9 = 32;
                bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                ux2Var15.g0(bjVar);
                ux2Var4 = ux2Var15;
            } else {
                vx6Var3 = vx6Var;
                ux2 ux2Var16 = ux2Var3;
                i9 = 32;
                bjVar = new bj(vx6Var3, objT, n81Var3, objH, null, (byte) 6);
                ux2Var16.g0(bjVar);
                ux2Var4 = ux2Var16;
            }
            ck3.i(vx6Var3, (hw2) bjVar, ux2Var4);
            Integer numValueOf6 = Integer.valueOf(i17);
            Boolean boolValueOf13 = Boolean.valueOf(z);
            if (i8 == i9) {
                z5 = true;
            } else {
                z5 = false;
            }
            zH8 = z5 | ux2Var4.h(n81Var3) | ux2Var4.h(h71Var);
            Object objK1116 = ux2Var4.K();
            obj12 = objK1116;
            if (zH8) {
                Object d81Var9 = new d81(z, n81Var3, h71Var, hc1Var4);
                ux2Var4.g0(d81Var9);
                obj12 = d81Var9;
            } else {
                Object d81Var10 = new d81(z, n81Var3, h71Var, hc1Var4);
                ux2Var4.g0(d81Var10);
                obj12 = d81Var10;
            }
            ck3.h(numValueOf6, boolValueOf13, (hw2) obj12, ux2Var4);
            Boolean boolValueOf14 = Boolean.valueOf(zA1);
            zF = ux2Var4.f(px4VarT) | ux2Var4.g(zA1);
            Object objK1117 = ux2Var4.K();
            obj13 = objK1117;
            if (zF) {
                Object e81Var11 = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                ux2Var4.g0(e81Var11);
                obj13 = e81Var11;
            } else {
                Object e81Var12 = new e81(px4VarT, zA1, hc1Var4, (byte) 0);
                ux2Var4.g0(e81Var12);
                obj13 = e81Var12;
            }
            ck3.i(boolValueOf14, (hw2) obj13, ux2Var4);
            Boolean boolValueOf15 = Boolean.valueOf(obj.b);
            zF2 = ux2Var4.f(r29) | ux2Var4.h(obj);
            Object objK1118 = ux2Var4.K();
            if (zF2) {
                b3 = 4;
                Object i9Var6 = new i9(px4VarT2, obj, hc1Var4, b3);
                ux2Var4.g0(i9Var6);
                obj14 = i9Var6;
            } else {
                b3 = 4;
                Object i9Var7 = new i9(px4VarT2, obj, hc1Var4, b3);
                ux2Var4.g0(i9Var7);
                obj14 = i9Var7;
            }
            ck3.i(boolValueOf15, (hw2) obj14, ux2Var4);
            Boolean boolValueOf16 = Boolean.valueOf(z2);
            z6 = z2;
            zF3 = ux2Var4.f(px4VarT3) | ux2Var4.g(z6);
            Object objK1119 = ux2Var4.K();
            obj15 = objK1119;
            if (zF3) {
                Object e81Var13 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                ux2Var4.g0(e81Var13);
                obj15 = e81Var13;
            } else {
                Object e81Var14 = new e81(px4VarT3, z6, hc1Var4, (byte) 1);
                ux2Var4.g0(e81Var14);
                obj15 = e81Var14;
            }
            ck3.i(boolValueOf16, (hw2) obj15, ux2Var4);
            h71Var3 = obj.a;
            if (h71Var3 == null) {
                j56VarR = ux2Var4.r();
                if (j56VarR != null) {
                    final byte b1113 = 0;
                    final vx6 vx6Var7 = vx6Var3;
                    final n81 n81Var8 = n81Var3;
                    final fs4 fs4Var10 = fs4Var3;
                    j56VarR.d = new hw2() { // from class: o.r71
                        @Override // o.hw2
                        public final Object invoke(Object obj218, Object obj219) {
                            byte b1114 = b1113;
                            f88 f88Var3 = f88.a;
                            int i18 = i3;
                            int i19 = i2;
                            switch (b1114) {
                                case 0:
                                    ((Integer) obj219).getClass();
                                    int iY = yo1.Y(i19 | 1);
                                    int iY2 = yo1.Y(i18);
                                    qf0.g(h71Var, z, function1, function2, function0, fs4Var10, function3, function4, function5, vx6Var7, function6, n81Var8, (ux2) obj218, iY, iY2);
                                    break;
                                default:
                                    ((Integer) obj219).getClass();
                                    int iY3 = yo1.Y(i19 | 1);
                                    int iY4 = yo1.Y(i18);
                                    qf0.g(h71Var, z, function1, function2, function0, fs4Var10, function3, function4, function5, vx6Var7, function6, n81Var8, (ux2) obj218, iY3, iY4);
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    return;
                }
                return;
            }
            h71Var2 = h71Var;
            n81Var4 = n81Var3;
            fs4 fs4Var11 = fs4Var3;
            function7 = function6;
            zH9 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
            objK3 = ux2Var4.K();
            if (zH9) {
                obj16 = objK3;
                final byte b1114 = 1;
                Object obj218 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b1115 = b1114;
                        byte b1116 = 3;
                        byte b1117 = 1;
                        f88 f88Var3 = f88.a;
                        byte b1118 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b1115) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1118), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1117), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b1116), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj218);
                obj16 = obj218;
            } else {
                obj16 = objK3;
                final byte b1115 = 1;
                Object obj219 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b1116 = b1115;
                        byte b1117 = 3;
                        byte b1118 = 1;
                        f88 f88Var3 = f88.a;
                        byte b1119 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b1116) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1119), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1118), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b1117), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj219);
                obj16 = obj219;
            }
            Function0 function1114 = (Function0) obj16;
            zH10 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
            Object objK2117 = ux2Var4.K();
            if (zH10) {
                b4 = 2;
                Object obj2110 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b1116 = b4;
                        byte b1117 = 3;
                        byte b1118 = 1;
                        f88 f88Var3 = f88.a;
                        byte b1119 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b1116) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1119), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1118), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b1117), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj2110);
                obj17 = obj2110;
            } else {
                b4 = 2;
                Object obj2111 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b1116 = b4;
                        byte b1117 = 3;
                        byte b1118 = 1;
                        f88 f88Var3 = f88.a;
                        byte b1119 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b1116) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1119), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1118), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b1117), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj2111);
                obj17 = obj2111;
            }
            Function0 function1115 = (Function0) obj17;
            zH11 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
            Object objK2118 = ux2Var4.K();
            obj18 = objK2118;
            if (zH11) {
                final byte b1116 = 0;
                Object obj322 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b1117 = b1116;
                        byte b1118 = 3;
                        byte b1119 = 1;
                        f88 f88Var3 = f88.a;
                        byte b11110 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b1117) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11110), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b1119), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b1118), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj322);
                obj18 = obj322;
            } else {
                final byte b1117 = 0;
                Object obj323 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b1118 = b1117;
                        byte b1119 = 3;
                        byte b11110 = 1;
                        f88 f88Var3 = f88.a;
                        byte b11111 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b1118) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11111), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11110), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b1119), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj323);
                obj18 = obj323;
            }
            Function0 function1116 = (Function0) obj18;
            zH12 = ux2Var4.h(n81Var4);
            Object objK2119 = ux2Var4.K();
            obj19 = objK2119;
            if (zH12) {
                final byte b1118 = 0;
                Object obj31113 = new Function0() { // from class: o.v71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b1119 = b1118;
                        f88 f88Var3 = f88.a;
                        n81 n81Var9 = n81Var4;
                        switch (b1119) {
                            case 0:
                                l97 l97Var = n81Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                break;
                            case 1:
                                n81Var9.W0();
                                break;
                            default:
                                n81Var9.V0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31113);
                obj19 = obj31113;
            } else {
                final byte b1119 = 0;
                Object obj31114 = new Function0() { // from class: o.v71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b11110 = b1119;
                        f88 f88Var3 = f88.a;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                l97 l97Var = n81Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                break;
                            case 1:
                                n81Var9.W0();
                                break;
                            default:
                                n81Var9.V0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31114);
                obj19 = obj31114;
            }
            Function0 function1117 = (Function0) obj19;
            zH13 = ux2Var4.h(n81Var4) | ux2Var4.h(h71Var3);
            Object objK21110 = ux2Var4.K();
            b5 = 3;
            obj20 = objK21110;
            if (zH13) {
                Object obj31115 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b11110 = b5;
                        byte b11111 = 3;
                        byte b11112 = 1;
                        f88 f88Var3 = f88.a;
                        byte b11113 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11113), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11112), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b11111), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31115);
                obj20 = obj31115;
            } else {
                Object obj31116 = new Function0() { // from class: o.p71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b11110 = b5;
                        byte b11111 = 3;
                        byte b11112 = 1;
                        f88 f88Var3 = f88.a;
                        byte b11113 = 2;
                        hc1 hc1Var8 = null;
                        h71 h71Var5 = h71Var3;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                h71Var5.getClass();
                                Integer num2 = h71Var5.n;
                                if (num2 != null) {
                                    if (num2.intValue() != n81Var9.n) {
                                        GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33.Contact, h71Var5.m));
                                        e27 e27Var = e27.a;
                                        if (groupMemberListElementViewModelM != null && GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_IsChatPossible(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM)) {
                                            IStartChatUIModelAndroid iStartChatUIModelAndroidGetStartChatUIModelAndroid = ChatUIModelLocatorAndroid.GetStartChatUIModelAndroid();
                                            if (iStartChatUIModelAndroidGetStartChatUIModelAndroid != null) {
                                                ChatConversationID chatConversationIDRequestPrivateRoomWithEndPoint = iStartChatUIModelAndroidGetStartChatUIModelAndroid.RequestPrivateRoomWithEndPoint(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetChatEndPoint(groupMemberListElementViewModelM.a, groupMemberListElementViewModelM));
                                                if (chatConversationIDRequestPrivateRoomWithEndPoint != null) {
                                                    im3.R(e8.n(n81Var9), null, null, new h0((Object) n81Var9, (Object) chatConversationIDRequestPrivateRoomWithEndPoint, hc1Var8, (byte) 28), 3);
                                                } else {
                                                    n81Var9.Y0(e27Var);
                                                }
                                            } else {
                                                ye4.a.g("ContactInfoScreenViewModel", "openChat: No chat UI model");
                                                n81Var9.Y0(e27Var);
                                            }
                                        } else {
                                            n81Var9.Y0(e27Var);
                                        }
                                    } else {
                                        n81Var9.Y0(d27.a);
                                    }
                                }
                                break;
                            case 1:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = false;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11113), 2);
                                break;
                            case 2:
                                h71Var5.getClass();
                                n81Var9.z = Integer.valueOf(h71Var5.m);
                                n81Var9.A = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new f81(n81Var9, h71Var5, hc1Var8, b11112), 2);
                                break;
                            default:
                                h71Var5.getClass();
                                n81Var9.B = true;
                                im3.R(e8.n(n81Var9), n81Var9.q, null, new ff(h71Var5, n81Var9, hc1Var8, b11111), 2);
                                n81Var9.W0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31116);
                obj20 = obj31116;
            }
            Function0 function1118 = (Function0) obj20;
            zH14 = ux2Var4.h(n81Var4);
            Object objK21111 = ux2Var4.K();
            if (zH14) {
                b6 = 1;
                Object obj31117 = new Function0() { // from class: o.v71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b11110 = b6;
                        f88 f88Var3 = f88.a;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                l97 l97Var = n81Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                break;
                            case 1:
                                n81Var9.W0();
                                break;
                            default:
                                n81Var9.V0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31117);
                obj21 = obj31117;
            } else {
                b6 = 1;
                Object obj31118 = new Function0() { // from class: o.v71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b11110 = b6;
                        f88 f88Var3 = f88.a;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                l97 l97Var = n81Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                break;
                            case 1:
                                n81Var9.W0();
                                break;
                            default:
                                n81Var9.V0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31118);
                obj21 = obj31118;
            }
            Function0 function1119 = (Function0) obj21;
            zH15 = ux2Var4.h(n81Var4);
            Object objK21112 = ux2Var4.K();
            obj22 = objK21112;
            if (zH15) {
                Object obj31119 = new Function0() { // from class: o.v71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b11110 = b4;
                        f88 f88Var3 = f88.a;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                l97 l97Var = n81Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                break;
                            case 1:
                                n81Var9.W0();
                                break;
                            default:
                                n81Var9.V0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj31119);
                obj22 = obj31119;
            } else {
                Object obj311110 = new Function0() { // from class: o.v71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        Object value;
                        byte b11110 = b4;
                        f88 f88Var3 = f88.a;
                        n81 n81Var9 = n81Var4;
                        switch (b11110) {
                            case 0:
                                l97 l97Var = n81Var9.r;
                                do {
                                    value = l97Var.getValue();
                                } while (!l97Var.j(value, i81.a((i81) value, null, false, null, null, false, false, null, false, false, false, true, 1023)));
                                break;
                            case 1:
                                n81Var9.W0();
                                break;
                            default:
                                n81Var9.V0();
                                break;
                        }
                        return f88Var3;
                    }
                };
                ux2Var4.g0(obj311110);
                obj22 = obj311110;
            }
            Function0 function11110 = (Function0) obj22;
            zH16 = ux2Var4.h(n81Var4);
            Object objK21113 = ux2Var4.K();
            if (zH16) {
                b7 = 0;
                Object a81Var6 = new a81(n81Var4, b7);
                ux2Var4.g0(a81Var6);
                obj23 = a81Var6;
            } else {
                b7 = 0;
                Object a81Var7 = new a81(n81Var4, b7);
                ux2Var4.g0(a81Var7);
                obj23 = a81Var7;
            }
            o71Var = new o71(function1114, function1115, function1116, function1117, function1118, function1119, function11110, (Function1) obj23);
            num = h71Var2.n;
            if (num == null) {
                b8 = b7;
            } else {
                b8 = b7;
            }
            zH17 = ux2Var4.h(n81Var4);
            objK4 = ux2Var4.K();
            if (zH17) {
                objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                ux2Var4.g0(objK4);
            } else {
                objK4 = new i0(1, n81Var4, n81.class, "updateContactName", "updateContactName(Ljava/lang/String;)V", 0, (byte) 21);
                ux2Var4.g0(objK4);
            }
            pu3 pu3Var4 = (pu3) objK4;
            zH18 = ux2Var4.h(n81Var4);
            objK5 = ux2Var4.K();
            if (zH18) {
                objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                ux2Var4.g0(objK5);
            } else {
                objK5 = new i0(1, n81Var4, n81.class, "updateContactDescription", "updateContactDescription(Ljava/lang/String;)V", 0, (byte) 22);
                ux2Var4.g0(objK5);
            }
            i81Var = obj;
            h(h71Var3, b8, z, i81Var, (Function1) pu3Var4, (Function1) ((pu3) objK5), fs4Var11, o71Var, ux2Var4, 3670912 & (i13 << 3), 0);
            ux2 ux2Var17 = ux2Var4;
            fs4Var2 = fs4Var11;
            ux2Var5 = ux2Var17;
            if (i81Var.j) {
                ux2Var5.W(955371436);
                boolean zH24 = ux2Var5.h(n81Var4);
                if (i7 == b3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zH24 | z7;
                Object objK21114 = ux2Var5.K();
                obj26 = objK21114;
                if (z8) {
                    Object x8Var9 = new x8(n81Var4, function7, (byte) 24);
                    ux2Var5.g0(x8Var9);
                    obj26 = x8Var9;
                } else {
                    Object x8Var10 = new x8(n81Var4, function7, (byte) 24);
                    ux2Var5.g0(x8Var10);
                    obj26 = x8Var10;
                }
                r9 = 0;
                j51.n((Function0) obj26, ux2Var5, 0);
                ux2Var5.p(false);
            } else {
                r9 = 0;
                ux2Var5.W(955549221);
                ux2Var5.p(false);
            }
            if (i81Var.k) {
                ux2Var5.W(955619560);
                String strZ7 = m77.z(R.string.contact_remove_dialog_title, ux2Var5);
                String strZ8 = m77.z(R.string.contact_remove_dialog_message, ux2Var5);
                zH19 = ux2Var5.h(o71Var);
                objK6 = ux2Var5.K();
                if (zH19) {
                    obj24 = objK6;
                    Object obj311111 = new Function0() { // from class: o.b81
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b11110 = r9;
                            f88 f88Var3 = f88.a;
                            o71 o71Var2 = o71Var;
                            switch (b11110) {
                                case 0:
                                    o71Var2.e.a();
                                    break;
                                default:
                                    o71Var2.f.a();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var5.g0(obj311111);
                    obj24 = obj311111;
                } else {
                    obj24 = objK6;
                    Object obj311112 = new Function0() { // from class: o.b81
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b11110 = r9;
                            f88 f88Var3 = f88.a;
                            o71 o71Var2 = o71Var;
                            switch (b11110) {
                                case 0:
                                    o71Var2.e.a();
                                    break;
                                default:
                                    o71Var2.f.a();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var5.g0(obj311112);
                    obj24 = obj311112;
                }
                Function0 function11111 = (Function0) obj24;
                zH20 = ux2Var5.h(o71Var);
                Object objK21115 = ux2Var5.K();
                obj25 = objK21115;
                if (zH20) {
                    final byte b11110 = 1;
                    Object obj311113 = new Function0() { // from class: o.b81
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b11111 = b11110;
                            f88 f88Var3 = f88.a;
                            o71 o71Var2 = o71Var;
                            switch (b11111) {
                                case 0:
                                    o71Var2.e.a();
                                    break;
                                default:
                                    o71Var2.f.a();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var5.g0(obj311113);
                    obj25 = obj311113;
                } else {
                    final byte b11111 = 1;
                    Object obj311114 = new Function0() { // from class: o.b81
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b11112 = b11111;
                            f88 f88Var3 = f88.a;
                            o71 o71Var2 = o71Var;
                            switch (b11112) {
                                case 0:
                                    o71Var2.e.a();
                                    break;
                                default:
                                    o71Var2.f.a();
                                    break;
                            }
                            return f88Var3;
                        }
                    };
                    ux2Var5.g0(obj311114);
                    obj25 = obj311114;
                }
                yo1.q(strZ7, strZ8, "TVTA-devicesScreen-removeContactDialog", function11111, (Function0) obj25, null, ux2Var5, 384);
                ux2Var5.p(r9);
            } else {
                ux2Var5.W(956108709);
                ux2Var5.p(r9);
            }
            n81Var2 = n81Var4;
            ux2Var2 = ux2Var5;
        } else {
            function7 = function6;
            h71Var2 = h71Var;
            ux2Var6.Q();
            fs4Var2 = fs4Var;
            n81Var2 = n81Var;
            ux2Var2 = ux2Var6;
        }
        j56 j56VarR2 = ux2Var2.r();
        if (j56VarR2 != null) {
            final byte b20 = 1;
            final fs4 fs4Var12 = fs4Var2;
            final h71 h71Var5 = h71Var2;
            final Function0 function22 = function7;
            j56VarR2.d = new hw2() { // from class: o.r71
                @Override // o.hw2
                public final Object invoke(Object obj2112, Object obj2113) {
                    byte b11112 = b20;
                    f88 f88Var3 = f88.a;
                    int i18 = i3;
                    int i19 = i2;
                    switch (b11112) {
                        case 0:
                            ((Integer) obj2113).getClass();
                            int iY = yo1.Y(i19 | 1);
                            int iY2 = yo1.Y(i18);
                            qf0.g(h71Var5, z, function1, function2, function0, fs4Var12, function3, function4, function5, vx6Var, function22, n81Var2, (ux2) obj2112, iY, iY2);
                            break;
                        default:
                            ((Integer) obj2113).getClass();
                            int iY3 = yo1.Y(i19 | 1);
                            int iY4 = yo1.Y(i18);
                            qf0.g(h71Var5, z, function1, function2, function0, fs4Var12, function3, function4, function5, vx6Var, function22, n81Var2, (ux2) obj2112, iY3, iY4);
                            break;
                    }
                    return f88Var3;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173  */
    /* JADX WARN: Code duplicated, block: B:96:0x0196  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    public static final void h(final h71 h71Var, final boolean z, final boolean z2, final i81 i81Var, final Function1 function1, final Function1 function2, fs4 fs4Var, o71 o71Var, ux2 ux2Var, final int i2, final int i3) {
        int i4;
        fs4 fs4Var2;
        o71 o71Var2;
        boolean z3;
        final fs4 fs4Var3;
        final o71 o71Var3;
        j56 j56VarR;
        fs4 fs4Var4;
        o71 o71Var4;
        fs4 fs4Var5;
        boolean z4;
        Object objK;
        h71Var.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var.Y(1079518420);
        if ((i2 & 6) == 0) {
            i4 = (ux2Var.h(h71Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(i81Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ux2Var.h(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= ux2Var.h(function2) ? 131072 : 65536;
        }
        int i5 = i3 & 64;
        if (i5 == 0) {
            if ((1572864 & i2) == 0) {
                fs4Var2 = fs4Var;
                i4 |= ux2Var.f(fs4Var2) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    o71Var2 = o71Var;
                    int i6 = ux2Var.h(o71Var2) ? 8388608 : 4194304;
                    i4 |= i6;
                } else {
                    o71Var2 = o71Var;
                }
                i4 |= i6;
            } else {
                o71Var2 = o71Var;
            }
            if ((4793491 & i4) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                ux2Var.S();
                if ((i2 & 1) != 0 || ux2Var.x()) {
                    if (i5 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if ((i3 & 128) != 0) {
                        fs4Var5 = fs4Var4;
                        o71Var4 = new o71(new y01((byte) 18), new y01((byte) 19), new y01((byte) 20), new y01((byte) 21), new y01((byte) 22), new y01((byte) 23), new y01((byte) 24), new h31((byte) 3));
                    } else {
                        o71Var4 = o71Var2;
                        fs4Var5 = fs4Var4;
                    }
                } else {
                    ux2Var.Q();
                    o71Var4 = o71Var2;
                    fs4Var5 = fs4Var2;
                }
                ux2Var.q();
                hk6 hk6VarW = im3.W(ux2Var);
                iq2 iq2Var = (iq2) ux2Var.j(b11.i);
                if (z2 || !i81Var.b) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                fs4 fs4VarA = mo8.A(fs4Var5.f(androidx.compose.foundation.layout.b.c), mo8.Y);
                objK = ux2Var.K();
                if (objK == e01.a) {
                    objK = ck3.w(ux2Var);
                    ux2Var.g0(objK);
                }
                vt1.h(z4, o77.t(fs4VarA, hk6VarW, (me1) objK), au8.O(-1821787697, new s71(iq2Var, i81Var, o71Var4, h71Var, z2, z, function1, function2), ux2Var), ux2Var, 384);
                o71Var3 = o71Var4;
                fs4Var3 = fs4Var5;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                o71Var3 = o71Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.t71
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qf0.h(h71Var, z, z2, i81Var, function1, function2, fs4Var3, o71Var3, (ux2) obj, yo1.Y(i2 | 1), i3);
                        return f88.a;
                    }
                };
            }
        }
        i4 |= 1572864;
        fs4Var2 = fs4Var;
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                o71Var2 = o71Var;
                if (ux2Var.h(o71Var2)) {
                }
                i4 |= i6;
            } else {
                o71Var2 = o71Var;
            }
            i4 |= i6;
        } else {
            o71Var2 = o71Var;
        }
        if ((4793491 & i4) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i4 & 1, z3)) {
            ux2Var.S();
            if ((i2 & 1) != 0) {
                if (i5 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i3 & 128) != 0) {
                    fs4Var5 = fs4Var4;
                    o71Var4 = new o71(new y01((byte) 18), new y01((byte) 19), new y01((byte) 20), new y01((byte) 21), new y01((byte) 22), new y01((byte) 23), new y01((byte) 24), new h31((byte) 3));
                } else {
                    o71Var4 = o71Var2;
                    fs4Var5 = fs4Var4;
                }
            } else {
                if (i5 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if ((i3 & 128) != 0) {
                    fs4Var5 = fs4Var4;
                    o71Var4 = new o71(new y01((byte) 18), new y01((byte) 19), new y01((byte) 20), new y01((byte) 21), new y01((byte) 22), new y01((byte) 23), new y01((byte) 24), new h31((byte) 3));
                } else {
                    o71Var4 = o71Var2;
                    fs4Var5 = fs4Var4;
                }
            }
            ux2Var.q();
            hk6 hk6VarW2 = im3.W(ux2Var);
            iq2 iq2Var2 = (iq2) ux2Var.j(b11.i);
            if (z2) {
                z4 = false;
            } else {
                z4 = false;
            }
            fs4 fs4VarA2 = mo8.A(fs4Var5.f(androidx.compose.foundation.layout.b.c), mo8.Y);
            objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            vt1.h(z4, o77.t(fs4VarA2, hk6VarW2, (me1) objK), au8.O(-1821787697, new s71(iq2Var2, i81Var, o71Var4, h71Var, z2, z, function1, function2), ux2Var), ux2Var, 384);
            o71Var3 = o71Var4;
            fs4Var3 = fs4Var5;
        } else {
            ux2Var.Q();
            fs4Var3 = fs4Var2;
            o71Var3 = o71Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.t71
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qf0.h(h71Var, z, z2, i81Var, function1, function2, fs4Var3, o71Var3, (ux2) obj, yo1.Y(i2 | 1), i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void i(h71 h71Var, fs4 fs4Var, ux2 ux2Var, int i2) {
        fs4 fs4Var2;
        ux2Var.Y(1860195399);
        int i3 = (ux2Var.h(h71Var) ? 4 : 2) | i2 | 48;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            bw bwVar = iq8.c;
            w50 w50Var = xz2.A;
            kw0 kw0VarA = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4Var2 = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var2);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            n(0, m77.z(R.string.contact_information_title, ux2Var), ux2Var, null);
            fs4 fs4VarD = ka0.D(au8.s(iq8.j(ka0.C(fs4Var2, 16.0f, 8.0f), sf6.a(8.0f)), ((rn4) ux2Var.j(un4.a)).a.H, kh.V), 0.0f, 8.0f, 1);
            kw0 kw0VarA2 = iw0.a(bwVar, w50Var, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarD);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            j(384, m77.z(R.string.tv_email, ux2Var), h71Var.p, ux2Var, androidx.compose.ui.platform.a.a(fs4Var2, "TVTA-devicesScreen-contactInfoScreen-contactInfo-email"));
            if (h71Var.t == b91.m) {
                ux2Var.W(-1821131598);
                j(384, m77.z(R.string.description_title, ux2Var), h71Var.q, ux2Var, androidx.compose.ui.platform.a.a(fs4Var2, "TVTA-devicesScreen-contactInfoScreen-contactInfo-description"));
                ux2Var.p(false);
            } else {
                ux2Var.W(-1820826961);
                ux2Var.p(false);
            }
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 10, i2, (Object) h71Var, (Object) fs4Var2);
        }
    }

    public static final void j(int i2, String str, String str2, ux2 ux2Var, fs4 fs4Var) {
        String strM;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-911302504);
        int i3 = i2 | (ux2Var2.f(str) ? 4 : 2) | (ux2Var2.f(str2) ? 32 : 16);
        if (ux2Var2.N(i3 & 1, (i3 & 147) != 146)) {
            fs4 fs4VarC = ka0.C(androidx.compose.foundation.layout.b.c(fs4Var, 1.0f), 16.0f, 8.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.n, ux2Var2, i3 & 14, 0, 131066);
            if (str2 == null) {
                strM = to7.m(ux2Var2, -1388502714, R.string.field_empty, ux2Var2, false);
            } else {
                ux2Var2.W(-1388503179);
                ux2Var2.p(false);
                strM = str2;
            }
            qs7.b(strM, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var2, 0, 0, 131066);
            ux2Var2 = ux2Var2;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z71(str, str2, fs4Var, i2, (byte) 0);
        }
    }

    public static final void k(int i2, int i3, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(915308793);
        int i4 = i3 | (ux2Var2.d(i2) ? 4 : 2) | (ux2Var2.f(str) ? 32 : 16) | (ux2Var.f(fs4Var) ? 256 : 128) | (ux2Var2.h(function0) ? 2048 : 1024);
        if (ux2Var2.N(i4 & 1, (i4 & 1171) != 1170)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(ka0.F(cs4.b, 0.0f, 0.0f, 0.0f, 3.0f, 7), 40.0f);
            qf6 qf6Var = sf6.a;
            pd3 pd3VarO = d82.o(ux2Var2);
            h72 h72Var = un4.a;
            xo1.k(function0, fs4VarL, false, pd3.b(pd3VarO, ((rn4) ux2Var2.j(h72Var)).a.L, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, 12), qf6Var, au8.O(-1815808027, new y71(i2, str), ux2Var2), ux2Var2, ((i4 >> 9) & 14) | 1572912, 20);
            qs7.b(str, null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.f952o, ux2Var, (i4 >> 3) & 14, 24960, 109562);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new i60(i2, str, fs4Var, function0, i3);
        }
    }

    public static final void l(int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        ux2Var.Y(-2054557833);
        int i3 = (ux2Var.h(function0) ? 32 : 16) | i2;
        byte b2 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            n(0, m77.z(R.string.other_connection_methods_title, ux2Var), ux2Var, null);
            fs4 fs4VarJ = iq8.j(cs4.b, sf6.a(8.0f));
            sk7 sk7Var = new sk7(y57.g(R.string.option_file_transfer), y57.g(R.string.option_file_transfer_description), null, e8.e, 4);
            boolean z = (i3 & 112) == 32;
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                objK = new a9(function0, (byte) 15);
                ux2Var.g0(objK);
            }
            x37.e(sk7Var, fs4VarJ, null, (Function0) objK, "TVTA-devicesScreen-contactInfoScreen-transferFileAction", ux2Var, 24576, 36);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x71(fs4Var, function0, i2, b2);
        }
    }

    public static final void m(fs4 fs4Var, Function0 function0, Function0 function1, Function0 function2, ux2 ux2Var, int i2) {
        ux2Var.Y(-331766091);
        byte b2 = 16;
        int i3 = i2 | (ux2Var.h(function0) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.h(function2) ? 2048 : 1024);
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0((byte) 2)), xz2.y, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-contactInfoScreen-connectOption");
            String strZ = m77.z(R.string.option_connect, ux2Var);
            boolean z = (i3 & 112) == 32;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = new a9(function0, b2);
                ux2Var.g0(objK);
            }
            k(R.drawable.ic_connect, 0, strZ, (Function0) objK, ux2Var, fs4VarA);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-contactInfoScreen-SendMessageAction");
            String strZ2 = m77.z(R.string.option_send_message, ux2Var);
            boolean z2 = (i3 & 896) == 256;
            Object objK2 = ux2Var.K();
            if (z2 || objK2 == awVar) {
                objK2 = new a9(function1, (byte) 17);
                ux2Var.g0(objK2);
            }
            k(R.drawable.ic_send_message, 0, strZ2, (Function0) objK2, ux2Var, fs4VarA2);
            fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(eg6.a(cs4Var, 1.0f), "TVTA-devicesScreen-contactInfoScreen-MoreAction");
            String strZ3 = m77.z(R.string.option_remove_contact, ux2Var);
            boolean z3 = (i3 & 7168) == 2048;
            Object objK3 = ux2Var.K();
            if (z3 || objK3 == awVar) {
                objK3 = new a9(function2, (byte) 18);
                ux2Var.g0(objK3);
            }
            k(R.drawable.ic_dismiss, 0, strZ3, (Function0) objK3, ux2Var, fs4VarA3);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new z8(fs4Var, function0, function1, function2, i2);
        }
    }

    public static final void n(int i2, String str, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        ux2Var.Y(503608641);
        int i3 = (ux2Var.f(str) ? 4 : 2) | i2 | 48;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarC = ka0.C(cs4Var, 16.0f, 8.0f);
            h72 h72Var = un4.a;
            qs7.b(str, fs4VarC, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(h72Var)).b.i, ux2Var, i3 & 14, 24960, 110584);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gx0(str, fs4Var2, i2, (byte) 1);
        }
    }

    public static final nw4 o(LiveData... liveDataArr) {
        if (liveDataArr.length == 0) {
            return new nw4(Boolean.FALSE);
        }
        LiveData[] liveDataArr2 = (LiveData[]) Arrays.copyOf(liveDataArr, liveDataArr.length);
        lo4 lo4Var = new lo4();
        c7 c7Var = new c7(lo4Var, liveDataArr2, (byte) 1);
        c7Var.a();
        for (LiveData liveData : liveDataArr2) {
            lo4Var.b(liveData, new b7(new t(c7Var, (byte) 8), (byte) 2));
        }
        return lo4Var;
    }

    public static ArrayList p(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new hw(objArr, true));
    }

    public static int q(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            hk0.g(fx3.f(size, "fromIndex (0) is greater than toIndex (", ")."));
            return 0;
        }
        if (size > size2) {
            hk0.r(fx3.d(size, size2, "toIndex (", ") is greater than size (", ")."));
            return 0;
        }
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int iQ = db8.q((Comparable) arrayList.get(i4), comparable);
            if (iQ < 0) {
                i2 = i4 + 1;
            } else {
                if (iQ <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static sa4 r(sa4 sa4Var) {
        sa4Var.g();
        sa4Var.f1999o = true;
        return sa4Var.n > 0 ? sa4Var : sa4.p;
    }

    public static void s(int i2) {
        if (2 > i2 || i2 >= 37) {
            gk0.p(fx3.k(i2, "radix ", " was not in valid range "), new yk3(2, 36, 1));
        }
    }

    public static sa4 t() {
        return new sa4(10);
    }

    public static final boolean u(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final boolean v(long j2, long j3) {
        return j2 == j3;
    }

    public static final int w(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objQ = i67.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return i4;
    }

    public static final View x(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(w(view, R.id.view_tree_lifecycle_owner), w(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (B(view) == null) {
                i2++;
                Object objQ = i67.q(view);
                View view4 = view2;
                view2 = view;
                view = objQ instanceof View ? (View) objQ : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final fs4 y(fs4 fs4Var, Function1 function1) {
        return fs4Var.f(new nq2(new pq2(function1)));
    }

    public static pg1 z(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            hk0.l("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return pg1.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i2 = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i3 = objectInputStream.readInt();
                    while (i2 < i3) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i2++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kh.n(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s2 = dataInputStream.readShort();
                    if (s2 == -21521) {
                        short s3 = dataInputStream.readShort();
                        if (s3 != 1) {
                            an4.g(fx3.e(s3, "Unsupported version number: "));
                        }
                    } else {
                        an4.g(fx3.e(s2, "Magic number doesn't match: "));
                    }
                    int i4 = dataInputStream.readInt();
                    while (i2 < i4) {
                        linkedHashMap.put(dataInputStream.readUTF(), A(dataInputStream, dataInputStream.readByte()));
                        i2++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        kh.n(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e2) {
            we4.f().e(yh1.a, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e3) {
            we4.f().e(yh1.a, "Error in Data#fromByteArray: ", e3);
        }
        return new pg1(linkedHashMap);
    }
}
