package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vb7 extends o77 {
    public static String B(String str) {
        return bq6.j0(new h18(new fx(str, (byte) 6), new fy("    ", (byte) 17)), "\n");
    }

    public static String C(String str) throws IOException {
        int length;
        Comparable comparable;
        String strSubstring;
        List listF0 = ub7.f0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF0) {
            if (!ub7.b0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!qf0.J(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listF0.size();
        int size = listF0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listF0) {
            int i = length + 1;
            if (length < 0) {
                qf0.U();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && ub7.b0(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    gk0.h(fx3.f(iIntValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        lv0.s0(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String D(String str) throws IOException {
        if (ub7.b0("|")) {
            hk0.g("marginPrefix must be non-blank string.");
            return null;
        }
        List listF0 = ub7.f0(str);
        int length = str.length();
        listF0.size();
        int size = listF0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listF0) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && ub7.b0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!qf0.J(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && bc7.M(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        lv0.s0(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}
