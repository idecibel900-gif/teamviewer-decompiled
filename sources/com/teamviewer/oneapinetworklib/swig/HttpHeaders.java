package com.teamviewer.oneapinetworklib.swig;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class HttpHeaders extends AbstractMap<String, String> {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public static class Iterator {
        protected transient boolean swigCMemOwn;
        private transient long swigCPtr;

        public Iterator(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public static long getCPtr(Iterator iterator) {
            if (iterator == null) {
                return 0L;
            }
            return iterator.swigCPtr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getKey() {
            return HttpHeadersSWIGJNI.HttpHeaders_Iterator_getKey(this.swigCPtr, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Iterator getNextUnchecked() {
            return new Iterator(HttpHeadersSWIGJNI.HttpHeaders_Iterator_getNextUnchecked(this.swigCPtr, this), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getValue() {
            return HttpHeadersSWIGJNI.HttpHeaders_Iterator_getValue(this.swigCPtr, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isNot(Iterator iterator) {
            return HttpHeadersSWIGJNI.HttpHeaders_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            HttpHeadersSWIGJNI.HttpHeaders_Iterator_setValue(this.swigCPtr, this, str);
        }

        public static long swigRelease(Iterator iterator) {
            if (iterator != null) {
                if (iterator.swigCMemOwn) {
                    long j = iterator.swigCPtr;
                    iterator.swigCMemOwn = false;
                    iterator.delete();
                    return j;
                }
                hk0.o("Cannot release ownership as memory is not owned");
            }
            return 0L;
        }

        public synchronized void delete() {
            try {
                long j = this.swigCPtr;
                if (j != 0) {
                    if (this.swigCMemOwn) {
                        this.swigCMemOwn = false;
                        HttpHeadersSWIGJNI.delete_HttpHeaders_Iterator(j);
                    }
                    this.swigCPtr = 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public void finalize() {
            delete();
        }
    }

    public HttpHeaders(HttpHeaders httpHeaders) {
        this(HttpHeadersSWIGJNI.new_HttpHeaders__SWIG_1(getCPtr(httpHeaders), httpHeaders), true);
    }

    private Iterator begin() {
        return new Iterator(HttpHeadersSWIGJNI.HttpHeaders_begin(this.swigCPtr, this), true);
    }

    private boolean containsImpl(String str) {
        return HttpHeadersSWIGJNI.HttpHeaders_containsImpl(this.swigCPtr, this, str);
    }

    private Iterator end() {
        return new Iterator(HttpHeadersSWIGJNI.HttpHeaders_end(this.swigCPtr, this), true);
    }

    private Iterator find(String str) {
        return new Iterator(HttpHeadersSWIGJNI.HttpHeaders_find(this.swigCPtr, this, str), true);
    }

    public static long getCPtr(HttpHeaders httpHeaders) {
        if (httpHeaders == null) {
            return 0L;
        }
        return httpHeaders.swigCPtr;
    }

    private void putUnchecked(String str, String str2) {
        HttpHeadersSWIGJNI.HttpHeaders_putUnchecked(this.swigCPtr, this, str, str2);
    }

    private void removeUnchecked(Iterator iterator) {
        HttpHeadersSWIGJNI.HttpHeaders_removeUnchecked(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    private int sizeImpl() {
        return HttpHeadersSWIGJNI.HttpHeaders_sizeImpl(this.swigCPtr, this);
    }

    public static long swigRelease(HttpHeaders httpHeaders) {
        if (httpHeaders != null) {
            if (httpHeaders.swigCMemOwn) {
                long j = httpHeaders.swigCPtr;
                httpHeaders.swigCMemOwn = false;
                httpHeaders.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        HttpHeadersSWIGJNI.HttpHeaders_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsImpl((String) obj);
        }
        return false;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    HttpHeadersSWIGJNI.delete_HttpHeaders(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.teamviewer.oneapinetworklib.swig.HttpHeaders$1] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, String>> entrySet() {
        HashSet hashSet = new HashSet();
        Iterator iteratorEnd = end();
        for (Iterator iteratorBegin = begin(); iteratorBegin.isNot(iteratorEnd); iteratorBegin = iteratorBegin.getNextUnchecked()) {
            hashSet.add(new Map.Entry<String, String>(this) { // from class: com.teamviewer.oneapinetworklib.swig.HttpHeaders.1
                private Iterator iterator;

                {
                    Objects.requireNonNull(this);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Map.Entry<String, String> init(Iterator iterator) {
                    this.iterator = iterator;
                    return this;
                }

                @Override // java.util.Map.Entry
                public String getKey() {
                    return this.iterator.getKey();
                }

                @Override // java.util.Map.Entry
                public String getValue() {
                    return this.iterator.getValue();
                }

                @Override // java.util.Map.Entry
                public String setValue(String str) {
                    String value = this.iterator.getValue();
                    this.iterator.setValue(str);
                    return value;
                }
            }.init(iteratorBegin));
        }
        return hashSet;
    }

    public void finalize() {
        delete();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (iteratorFind.isNot(end())) {
            return iteratorFind.getValue();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return HttpHeadersSWIGJNI.HttpHeaders_isEmpty(this.swigCPtr, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String put(String str, String str2) {
        Iterator iteratorFind = find(str);
        if (!iteratorFind.isNot(end())) {
            putUnchecked(str, str2);
            return null;
        }
        String value = iteratorFind.getValue();
        iteratorFind.setValue(str2);
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        Iterator iteratorFind = find((String) obj);
        if (!iteratorFind.isNot(end())) {
            return null;
        }
        String value = iteratorFind.getValue();
        removeUnchecked(iteratorFind);
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return sizeImpl();
    }

    public HttpHeaders() {
        this(HttpHeadersSWIGJNI.new_HttpHeaders__SWIG_0(), true);
    }

    public HttpHeaders(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
