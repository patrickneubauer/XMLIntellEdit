# XMLText: From XML Schema to Xtext
![Logo](http://xmltext.big.tuwien.ac.at/XMLTextLogo.png)

A multitude of Domain-Specific Languages (DSLs) have been implemented with XML Schemas.
While such DSLs are well adopted and flexible, they miss modern DSL editor functionality.
Moreover, since XML is primarily designed as a machine-processible format, artifacts defined with XML-based DSLs lack comprehensibility and, therefore, maintainability.

In order to tackle these shortcomings (cf. [Individial Experiments](https://github.com/patrickneubauer/XMLText/tree/master/INDIVIDUAL%20EXPERIMENTS)), we propose a bridge between the XML Schema Definition (XSD) language and text-based metamodeling frameworks. This bridge exploits existing seams between these two worlds and closes identified gaps.

The resulting approach (cf. [Individial Experiments](https://github.com/patrickneubauer/XMLText/tree/master/INDIVIDUAL%20EXPERIMENTS) and [Framework](https://github.com/patrickneubauer/XMLText/tree/master/FRAMEWORK/XsdToXtextFramework)) is able to generate Xtext-based editors from XSDs providing powerful editor functionality, customization options for the textual concrete syntax style, and round-trip transformations enabling the exchange of data between these two worlds.

We evaluate our approach by a case study on TOSCA, which is an XML-based standard for defining Cloud deployments.
The [results](https://github.com/patrickneubauer/XMLText/tree/master/TOSCA) show that our approach enables bridging XMLware and Modelware in several ways going beyond existing approaches and allows the automated generation of editors that are at least equivalent to editors manually built for XML-based languages.

See also [XMLText Project Website](http://xmltext.big.tuwien.ac.at).

#### External Resources

* [OASIS TOSCA standard specification](http://docs.oasis-open.org/tosca/TOSCA/v1.0/os/TOSCA-v1.0-os.html) used to construct the DSML
* [Cloudify DSL parser](https://github.com/cloudify-cosmo/cloudify-dsl-parser/blob/b9495371723e9c59a90f76b52886f36653c88f9a/dsl_parser/parser.py), a hand-crafted DSL parser for TOSCA that has been used as a comparison
* Our prototype builds on the [Eclipse Modeling Framework](https://eclipse.org/modeling/emf/) and the [Xtext framework](https://eclipse.org/Xtext/) 
