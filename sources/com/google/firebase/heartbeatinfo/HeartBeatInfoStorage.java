package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import o.an4;
import o.er5;
import o.f88;
import o.fx4;
import o.ua5;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class HeartBeatInfoStorage {
    private static final er5 GLOBAL = new er5("fire-global");
    private static final er5 HEART_BEAT_COUNT_TAG = new er5("fire-count");
    private static final er5 LAST_STORED_DATE = new er5("last-used-date");
    private final JavaDataStorage firebaseDataStore;

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseDataStore = new JavaDataStorage(context, ua5.m("FirebaseHeartBeat", str));
    }

    private long cleanUpStoredHeartBeats(fx4 fx4Var) {
        long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(fx4Var, HEART_BEAT_COUNT_TAG, 0L)).longValue();
        Set hashSet = new HashSet();
        String str = null;
        String str2 = "";
        for (Map.Entry entry : fx4Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set<String> set = (Set) entry.getValue();
                for (String str3 : set) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = ((er5) entry.getKey()).a;
                        hashSet = set;
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet2.remove(str);
        str2.getClass();
        fx4Var.d(new er5(str2), hashSet2);
        long j = jLongValue - 1;
        fx4Var.c(HEART_BEAT_COUNT_TAG, Long.valueOf(j));
        return j;
    }

    private String getFormattedDate(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private er5 getStoredUserAgentString(fx4 fx4Var, String str) {
        for (Map.Entry entry : fx4Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((er5) entry.getKey()).a;
                        str2.getClass();
                        return new er5(str2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f88 lambda$deleteAllHeartBeats$0(fx4 fx4Var) {
        Map mapA = fx4Var.a();
        LinkedHashMap linkedHashMap = fx4Var.a;
        long j = 0;
        for (Map.Entry entry : mapA.entrySet()) {
            if (entry.getValue() instanceof Set) {
                er5 er5Var = (er5) entry.getKey();
                Set set = (Set) entry.getValue();
                String formattedDate = getFormattedDate(System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    Object[] objArr = {formattedDate};
                    HashSet hashSet = new HashSet(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        an4.i(obj, "duplicate element: ");
                        return null;
                    }
                    fx4Var.c(er5Var, Collections.unmodifiableSet(hashSet));
                    j++;
                } else {
                    er5Var.getClass();
                    fx4Var.b();
                    linkedHashMap.remove(er5Var);
                }
            }
        }
        if (j == 0) {
            er5 er5Var2 = HEART_BEAT_COUNT_TAG;
            er5Var2.getClass();
            fx4Var.b();
            linkedHashMap.remove(er5Var2);
        } else {
            fx4Var.c(HEART_BEAT_COUNT_TAG, Long.valueOf(j));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f88 lambda$postHeartBeatCleanUp$1(String str, fx4 fx4Var) {
        fx4Var.c(LAST_STORED_DATE, str);
        removeStoredDate(fx4Var, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f88 lambda$storeHeartBeat$2(String str, String str2, er5 er5Var, fx4 fx4Var) {
        er5 er5Var2 = LAST_STORED_DATE;
        if (((String) JavaDataStorageKt.getOrDefault(fx4Var, er5Var2, "")).equals(str)) {
            er5 storedUserAgentString = getStoredUserAgentString(fx4Var, str);
            if (storedUserAgentString == null || storedUserAgentString.a.equals(str2)) {
                return null;
            }
            updateStoredUserAgent(fx4Var, er5Var, str);
            return null;
        }
        er5 er5Var3 = HEART_BEAT_COUNT_TAG;
        long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(fx4Var, er5Var3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = cleanUpStoredHeartBeats(fx4Var);
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(fx4Var, er5Var, new HashSet()));
        hashSet.add(str);
        fx4Var.c(er5Var, hashSet);
        fx4Var.c(er5Var3, Long.valueOf(jLongValue + 1));
        fx4Var.c(er5Var2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f88 lambda$updateGlobalHeartBeat$3(long j, fx4 fx4Var) {
        fx4Var.c(GLOBAL, Long.valueOf(j));
        return null;
    }

    private void removeStoredDate(fx4 fx4Var, String str) {
        er5 storedUserAgentString = getStoredUserAgentString(fx4Var, str);
        if (storedUserAgentString == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(fx4Var, storedUserAgentString, new HashSet()));
        hashSet.remove(str);
        if (!hashSet.isEmpty()) {
            fx4Var.getClass();
            fx4Var.d(storedUserAgentString, hashSet);
        } else {
            fx4Var.getClass();
            fx4Var.b();
            fx4Var.a.remove(storedUserAgentString);
        }
    }

    private void updateStoredUserAgent(fx4 fx4Var, er5 er5Var, String str) {
        removeStoredDate(fx4Var, str);
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(fx4Var, er5Var, new HashSet()));
        hashSet.add(str);
        fx4Var.c(er5Var, hashSet);
    }

    public synchronized void deleteAllHeartBeats() {
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.m.lambda$deleteAllHeartBeats$0((fx4) obj);
            }
        });
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            for (Map.Entry<er5, Object> entry : this.firebaseDataStore.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey().a, new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public boolean isSameDateUtc(long j, long j2) {
        return getFormattedDate(j).equals(getFormattedDate(j2));
    }

    public synchronized void postHeartBeatCleanUp() {
        final String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.m.lambda$postHeartBeatCleanUp$1(formattedDate, (fx4) obj);
            }
        });
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }

    public synchronized boolean shouldSendSdkHeartBeat(er5 er5Var, long j) {
        if (isSameDateUtc(((Long) this.firebaseDataStore.getSync(er5Var, -1L)).longValue(), j)) {
            return false;
        }
        this.firebaseDataStore.putSync(er5Var, Long.valueOf(j));
        return true;
    }

    public synchronized void storeHeartBeat(long j, final String str) {
        final String formattedDate = getFormattedDate(j);
        str.getClass();
        final er5 er5Var = new er5(str);
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.m.lambda$storeHeartBeat$2(formattedDate, str, er5Var, (fx4) obj);
            }
        });
    }

    public synchronized void updateGlobalHeartBeat(final long j) {
        this.firebaseDataStore.editSync(new Function1() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.lambda$updateGlobalHeartBeat$3(j, (fx4) obj);
            }
        });
    }
}
