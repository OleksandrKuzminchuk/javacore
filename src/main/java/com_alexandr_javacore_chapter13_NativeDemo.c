#include <jni.h>
#include "com_alexandr_javacore_chapter13_NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL com_alexandr_javacore_chapter13_NativeDemo_test(JNIEnv *env, jobject obj)
{
jclass cls;
jfieldID fid;
jint i;

printf("Start the platformer of an oriented method\n");
cls = (*env)->GetObjectClass(env, obj);
fid = (*env)->GetFieldID(env, cls, "i", "I");

if(fid == 0){
printf("Can not get a field id\n");
return;
i = (*env)->GetIntField(env, obj, fid);
printf("i = %d\n", i);
(*env)->SetIntField(env, obj, fid, 2*i);
printf("Finish the platformer of an oriented method\n");
}
}
