Simple Java project to demonstrate how to generate javadocs

## javadoc comments
There are three types of comments in Java:

- single-line comment `// compiler ignores everything to the end of the line`
- multi-line comments `/* comment that spans over multiple lines */`
- doc comment `/** javadoc comments with tags */`

Note that doc comments start with a forward slash and double asterix, opposed to single asterix in multi-line comments.
Within comments describe your classes, fields, methods, etc.
Use javadoc tags. For conventions and style guide see [Oracle guide](https://www.oracle.com/technetwork/java/javase/documentation/index-137868.html).
See [SampleClass](https://github.com/dRadovan/Generate-Javadocs/blob/master/src/com/dradest/sample/generatejavadocs/SampleClass.java) and [Main](https://github.com/dRadovan/Generate-Javadocs/blob/master/src/com/dradest/sample/main/Main.java) in this project for simple examples.


### ... in Eclipse

Type `/**` and press enter. This will generate a doc comment. 
Style your comments, accordingly.<br>
As you type `@` list of tags will appear.

To generate javadocs:

* go to `Project` > `Generate Javadoc...`
* find the location of _javadoc.exe_ tool under `Javadoc command`
* select packages and members' visibility you wish to generate javadocs for
* choose where would you like to save generated javadoc under `Destination`
* for additional settings click `Next` or `Finish` to use default

Documentation should be in the specified location. For this project, it is in doc folder.

For visual guide, see this blog [post](http://dradest.com/blog/2019/02/22/how-to-generate-javadocs-in-eclipse/).

To see generated javadocs in your web browser, navigate to the doc folder and open index.html or follow this [link](http://dradest.com/generatejavadocs/).

