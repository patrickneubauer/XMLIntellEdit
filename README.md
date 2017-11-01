[![Build Status](https://travis-ci.org/patrickneubauer/XMLIntellEdit.svg?branch=master)](https://travis-ci.org/patrickneubauer/XMLIntellEdit)
# Modernizing Domain-Specific Languages with XMLText and IntellEdit
![Logo](http://xmlintelledit.big.tuwien.ac.at/img/XMLIntellEditLogo.svg)

The necessity of software evolution caused by novel requirements is often triggered alongside the advancement of underlying languages and tools.

Although modern language workbenches decrease the opportunity cost of creating new language implementations, they do not offer automated and complete integration of existing languages. Moreover, they still require complex language engineering skills and extensive manual implementation effort to suit the expectations of domain experts, e.g., in terms of editor capabilities.

XMLIntellEdit represents a framework for evolving domain-specific languages by automating the generation of modernized languages offering advanced editing capabilities, such as extended validation, content-assist, and quick fix solutions.

Our approach builds on techniques from Model-Driven Engineering and Search-based Software Engineering research.

Initial results indicate that XML Schema definitions containing restrictions can be applied for the automated generation of advanced editing facilities.

#### Modules

* [XMLText](https://github.com/patrickneubauer/XMLIntellEdit/tree/master/xmlintelledit/xmltext)
* [IntellEdit](https://github.com/patrickneubauer/XMLIntellEdit/tree/master/xmlintelledit/intelledit)
* [XtextUtils](https://github.com/patrickneubauer/XMLIntellEdit/tree/master/xmlintelledit/xtextutils)

See also [XMLIntellEdit Project Website](http://xmlintelledit.big.tuwien.ac.at).

#### How to run 

After importing the maven project in Eclipse, run the following command:
mvn clean install

Alternatively, right-click on the "xmlintelledit-parent" project and select "Run as > Maven install".

#### External Resources

* Our prototype builds on the [Eclipse Modeling Framework](https://eclipse.org/modeling/emf/) and the [Xtext framework](https://eclipse.org/Xtext/) 
