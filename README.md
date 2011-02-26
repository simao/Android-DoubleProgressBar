# Android Double Progress Bar #

## Purpose ##

While developing an Android App I needed a widget to show two progress
bars at the same time. One to show the overall progress and another to
show the intermediate progress.

I first tried to extend the ProgressBar class included with the
Android SDK which didn't work out because of the fields in ProgressBar
are defined as private.

I then used the code in ProgressDialog.java directly, extending
AlertDialog and overriding `setSecondaryProgress` so it updates the
second progress bar instead of drawing another bar behind the primary
progress bar.

## Example ##

The following screenshot illustrates how this widget looks using the
included example project.

![DoubleProgressBatExample](DoubleProgressBatExample](https://github.com/simao/Android-DoubleProgressBar/raw/master/screenshot.png)

## How to use ##

The usage is actually pretty simple:

1. Copy DoubleProgressBar.java to your classpath
3. Copy the included `res/layout/alert_dialog_double_progress.xml`
   file to your `res/layout` folder.
2. Adjust `package com.simaomata;` to match your package.
3. Create a new DoubleProgress bar as needed.

        progressDialog = new DoubleProgressDialog(this);
        progressDialog.setMessage("Double progress test");
        progressDialog.setCancelable(true);
        progressDialog.setButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        progressDialog.show();

4. Set primary and secondary progress using the appropriate methods,
always using a progress values ranging from 0 to 100.

        progressDialog.setProgress(64);
        progressDialog.setSecondaryProgress(32);
    

## Drawbacks and future improvements ##

There are some rough edges,

* Only tested under Android SDK API Level 2.1
* Only tested when directly feeding the calculated percentage to
  setProgress and setSecondaryProgess, withouth using setMax.

## Contributions ##

Clearly, there is room for improvement. If you find yourself using
this widget, please send me a pull request.

## LICENSE ##

This widget is based on the ProgressDialog.java file included with the
Android SDK, so it's licensed under an Apache Licensed.

Copyright 2010 Simão Mata

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
