package com.teamviewer.chatviewmodel.swig;

/* JADX INFO: loaded from: classes.dex */
public class StorageManagerTransferDataSWIGJNI {
    public static final native String MapOfStringString_Iterator_getKey(long j, MapOfStringString.Iterator iterator);

    public static final native long MapOfStringString_Iterator_getNextUnchecked(long j, MapOfStringString.Iterator iterator);

    public static final native String MapOfStringString_Iterator_getValue(long j, MapOfStringString.Iterator iterator);

    public static final native boolean MapOfStringString_Iterator_isNot(long j, MapOfStringString.Iterator iterator, long j2, MapOfStringString.Iterator iterator2);

    public static final native void MapOfStringString_Iterator_setValue(long j, MapOfStringString.Iterator iterator, String str);

    public static final native long MapOfStringString_begin(long j, MapOfStringString mapOfStringString);

    public static final native void MapOfStringString_clear(long j, MapOfStringString mapOfStringString);

    public static final native boolean MapOfStringString_containsImpl(long j, MapOfStringString mapOfStringString, String str);

    public static final native long MapOfStringString_end(long j, MapOfStringString mapOfStringString);

    public static final native long MapOfStringString_find(long j, MapOfStringString mapOfStringString, String str);

    public static final native boolean MapOfStringString_isEmpty(long j, MapOfStringString mapOfStringString);

    public static final native void MapOfStringString_putUnchecked(long j, MapOfStringString mapOfStringString, String str, String str2);

    public static final native void MapOfStringString_removeUnchecked(long j, MapOfStringString mapOfStringString, long j2, MapOfStringString.Iterator iterator);

    public static final native int MapOfStringString_sizeImpl(long j, MapOfStringString mapOfStringString);

    public static final native long StorageManagerTransferData_metadata_get(long j, StorageManagerTransferData storageManagerTransferData);

    public static final native String StorageManagerTransferData_transferId_get(long j, StorageManagerTransferData storageManagerTransferData);

    public static final native String StorageManagerTransferData_url_get(long j, StorageManagerTransferData storageManagerTransferData);

    public static final native void delete_MapOfStringString(long j);

    public static final native void delete_MapOfStringString_Iterator(long j);

    public static final native void delete_StorageManagerTransferData(long j);

    public static final native long new_MapOfStringString__SWIG_0();

    public static final native long new_MapOfStringString__SWIG_1(long j, MapOfStringString mapOfStringString);

    public static final native long new_StorageManagerTransferData__SWIG_0(String str, String str2);

    public static final native long new_StorageManagerTransferData__SWIG_1(String str, String str2, long j, MapOfStringString mapOfStringString);
}
