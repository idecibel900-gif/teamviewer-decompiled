package o;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class os0 {
    public static final String a;
    public static final LinkedHashMap b;

    static {
        String str;
        String strT0 = lv0.t0(qf0.L('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        a = strT0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listL = qf0.L("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iE = bt1.E(0, listL.size() - 1, 2);
        if (iE >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listL.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listL.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(e41.l(sb2, (String) listL.get(i), "Array"), "[" + ((String) listL.get(i2)));
                if (i == iE) {
                    break;
                } else {
                    i += 2;
                }
            }
            strT0 = str;
        }
        linkedHashMap.put(strT0 + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : qf0.L("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : qf0.L("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(ua5.m("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i3 = 0; i3 < 23; i3++) {
            String strE = fx3.e(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(strE, sb3.toString(), linkedHashMap);
            a("reflect/KFunction" + i3, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : qf0.L("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(ua5.z(str5, ".Companion"), e41.m(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        str.getClass();
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        String strReplace = str.replace('.', '$');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(';');
        return sb.toString();
    }
}
