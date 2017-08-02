# Automated Generation of Consistency-Achieving Model Editors with IntellEdit
![Logo](http://intelledit.big.tuwien.ac.at/img/IntellEditLogo.svg)

The advances of domain-specific modeling languages (DSMLs) and their editors, created with modern language workbenches, have convinced domain experts of applying them as important and powerful means in their daily endeavors. 

Despite the fact that such editors are proficient in retaining syntactical model correctness, they present major shortages in mastering the preservation of consistency in models with elaborated language-specific constraints.

Consequently, there is a demand for automating procedures to support editor users in both comprehending as well as resolving consistency violations.

In this paper, we present an approach to automate the generation of advanced editing support for DSMLs offering automated validation, content-assist and quick fix capabilities beyond those created by state-of-the-art language workbenches that help domain experts in retaining and achieving the consistency of models.

For validation, we show potential error causes for violated constraints, instead of only the context in which constraints are violated.
The state-space explosion problem is mitigated by our approach resolving constraint violations by increasing the neighborhood scope in a three-stage process, seeking constraint repair solutions presented as quick fixes to the editor user.

We illustrate and provide an initial evaluation of our approach based on an Xtext-based DSML for modeling service clusters.

See also [IntellEdit Project Website](http://intelledit.big.tuwien.ac.at).

#### How to run 

After importing all projects in Eclipse, you have to do the following steps:

1. Clean the workspace
2. Right-click on "at.ac.tuwien.big.serviceexample/model/serviceexample.ecore" and register the package
3. Open the file "at.ac.tuwien.big.servicelang/src/at.ac.tuwien.big.servicelang/Service.xtext", perform a change in the same file, revert the change, and save the null change (this will remove any errors displayed in the grammar editor)
4. Run everything as eclipse application by right-clicking on any imported project in the package explorer and select "Run As > Eclipse Application" (a new Eclipse instance will open)
+ In case there are still errors in the workspace, click "Proceed" in the eventually opening pop-up window
5. Create a new empty project in the new Eclipse instance and a file ending with ".service", i.e., representing a model of our exemplary DSML
6. Copy and paste the content from the file "at.ac.tuwien.big.serviceexample/model/test.service" to the ".service" file you just created
1. The validation of the file is only applied after each save

#### External Resources

* Our prototype builds on the [Eclipse Modeling Framework](https://eclipse.org/modeling/emf/) and the [Xtext framework](https://eclipse.org/Xtext/) 
