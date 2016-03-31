Hello Third Party
=================
Hello Third Party Lib is an Android C++ sample that depends on a prebuilt static library (Play Game C++ SDK).

This sample uses the new [Gradle Experimental Android plugin](http://tools.android.com/tech-docs/new-build-system/gradle-experimental) with C++ support.

Pre-requisites
--------------
- Android Studio 1.5+ with [NDK](https://developer.android.com/ndk/) bundle.

Getting Started
---------------
1. [Download Android Studio](http://developer.android.com/sdk/index.html)
1. Launch Android Studio.
1. Open the sample directory.
1. Open *File/Project Structure...*
  - Click *Download* or *Select NDK location*.
1. Click *Tools/Android/Sync Project with Gradle Files*.
1. Right Click on build.gradle for module `gpg-sdk`
  - Select 'Run build'
1. Update the source with the details of your project:
  - Update the package name in `app/build.gradle` and  `app/src/main/AndroidManifest.xml`.
  - Set `APP_ID` in `app/res/values/ids.xml` to the ID your project in the *Game services* section of the Google Play console.
    __NOTE:__ If you fail to set the app ID or package name correctly, the sample will crash or behave unexpectedly.
1. Click *Run/Run 'app'*.


Project structure
-----------------
This project consists of 2 sub-projects.  The first the "app" and contains
the application code and resources.  It is dependendent on the second sub-project
"thirdparty/gpg-sdk" which downloads and unzips the Google Play Games SDK.

This demonstrates one way to organize and manage thirdparty libraries.


License
-------
Copyright 2015 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
