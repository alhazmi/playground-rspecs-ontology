/* CVS $Id: $ */
package info.openmultinet.ontology.vocabulary; 
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*;
 
/**
 * Vocabulary definitions from file:/Users/robynloughnane/git/omnnew/playground-rspecs-ontology/omnlib/ontologies/omn-monitoring-tool.ttl 
 * @author Auto-generated by schemagen on 01 Sep 2015 13:43 
 */
public class Omn_monitoring_tool {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://open-multinet.info/ontology/omn-monitoring-tool#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The communication paradigm the monitoring tool is using.</p> */
    public static final ObjectProperty communicationParadigm = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-monitoring-tool#communicationParadigm" );
    
    /** <p>Defines from which data format the tool converts the available data .</p> */
    public static final ObjectProperty convertsDataFrom = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-monitoring-tool#convertsDataFrom" );
    
    /** <p>Defines to which data format the tool converts the available data .</p> */
    public static final ObjectProperty convertsDataTo = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-monitoring-tool#convertsDataTo" );
    
    /** <p>The data access capability the monitoring tool provides.</p> */
    public static final ObjectProperty dataAccessProvided = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-monitoring-tool#dataAccessProvided" );
    
    /** <p>Reports data about particular domain or resource.</p> */
    public static final ObjectProperty reportesDataAbout = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-monitoring-tool#reportesDataAbout" );
    
    /** <p>Determines the data broker used by a service or a tool.</p> */
    public static final ObjectProperty usesDataBroker = m_model.createObjectProperty( "http://open-multinet.info/ontology/omn-monitoring-tool#usesDataBroker" );
    
    /** <p>Represents the Appication Programming Interface used to get/access the data.</p> */
    public static final OntClass API = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#API" );
    
    /** <p>Represents any tool used to execute active measurments.</p> */
    public static final OntClass ActiveMeasurementTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#ActiveMeasurementTool" );
    
    /** <p>Represents any tool used to adapt and convert the collected data from one 
     *  format to anohter.</p>
     */
    public static final OntClass Adapter = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Adapter" );
    
    /** <p>Represents any tool used for analysing the collected monitoring and measurement 
     *  data.</p>
     */
    public static final OntClass AnalysisTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#AnalysisTool" );
    
    /** <p>Represents any tool used for capturing monitoring and measurement data.</p> */
    public static final OntClass CaptureTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#CaptureTool" );
    
    /** <p>The tool collects the data at a central point (collector/server).</p> */
    public static final OntClass Centralized = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Centralized" );
    
    public static final OntClass ClientServer = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#ClientServer" );
    
    /** <p>Represents the endpoint of a monitoring data collection service.</p> */
    public static final OntClass CollectionEndpoint = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#CollectionEndpoint" );
    
    /** <p>Represents any tool used for collecting monitoring and measurement data.</p> */
    public static final OntClass Collector = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Collector" );
    
    /** <p>Describes the communication paradigm used in the tool to perform the measurements 
     *  and monitoring services.</p>
     */
    public static final OntClass CommunicationParadigm = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#CommunicationParadigm" );
    
    /** <p>Describes the data access capability of a tool for its users.</p> */
    public static final OntClass DataAccess = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#DataAccess" );
    
    /** <p>Represents any tool that acts as a data broker between two tools or between 
     *  a service and a collection resource.</p>
     */
    public static final OntClass DataBroker = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#DataBroker" );
    
    /** <p>Represents any database management system.</p> */
    public static final OntClass Database = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Database" );
    
    /** <p>The tool has other components that collect the data that are then merged.</p> */
    public static final OntClass Distributed = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Distributed" );
    
    /** <p>Represents any tool used to export the collected data to a remote/external 
     *  collector.</p>
     */
    public static final OntClass Exporter = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Exporter" );
    
    /** <p>Represents filtering capability of the monitoring tool.</p> */
    public static final OntClass Filter = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#Filter" );
    
    /** <p>Represents the Graphical User Interface used to get/access the data.</p> */
    public static final OntClass GUI = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#GUI" );
    
    /** <p>Represents any tool used for geographical visualizations.</p> */
    public static final OntClass GeographicalVisualizationTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#GeographicalVisualizationTool" );
    
    /** <p>Represents any tool used to visualize/display measurement data graphically.</p> */
    public static final OntClass GraphicalVisualizationTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#GraphicalVisualizationTool" );
    
    /** <p>Represents any tool used to execute the measurments.</p> */
    public static final OntClass MeasurementTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#MeasurementTool" );
    
    /** <p>Represents monitoring dashboard capability of the monitoring tool.</p> */
    public static final OntClass MonitoringDashboard = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#MonitoringDashboard" );
    
    /** <p>Represents any tool used for performing monitoring service.</p> */
    public static final OntClass MonitoringTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#MonitoringTool" );
    
    public static final OntClass P2P = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#P2P" );
    
    /** <p>Represents any tool used to execute passive measurments.</p> */
    public static final OntClass PassiveMeasurementTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#PassiveMeasurementTool" );
    
    /** <p>SQL (Structured Query Language) is a special-purpose programming language 
     *  designed for managing data held in a relational database management system 
     *  (RDBMS), or for stream processing in a relational data stream management system 
     *  (RDSMS).</p>
     */
    public static final OntClass SQL = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#SQL" );
    
    /** <p>Represents any tool used to visualize topologies.</p> */
    public static final OntClass TopologicalVisualizationTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#TopologicalVisualizationTool" );
    
    /** <p>Represents any tool used to visualize the collected monitoring and measurement 
     *  data.</p>
     */
    public static final OntClass VisualizationTool = m_model.createClass( "http://open-multinet.info/ontology/omn-monitoring-tool#VisualizationTool" );
    
    /** <p>Iperf is a tool used used for capturing data, monitoring or for executing 
     *  passive measurements. It is used to measure maximum TCP bandwidth, allowing 
     *  the tuning of various parameters and UDP characteristics. Iperf reports bandwidth, 
     *  delay jitter, datagram loss. Website: https://iperf.fr.</p>
     */
    public static final Individual Iperf = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Iperf", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Is a SPARQL server with a native triple store database (TDB) that serves storing 
     *  and querying data as RDF triples over HTTP. Website: http://jena.apache.org/documentation/serving_data/.</p>
     */
    public static final Individual JenaFuseki = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#JenaFuseki", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Manifod acts as a data broker in this matter to retrieve monitoring data from 
     *  a central collection point. It allows users to express queries over heterogeneous 
     *  sources of data and aggregate results based on common key attributes. Website: 
     *  http://trac.myslice.info/wiki/Manifold.</p>
     */
    public static final Individual Manifold = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Manifold", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Nagios is a computer network monitoring solution used to monitor network objects. 
     *  For more information visit its website: https://www.nagios.com.</p>
     */
    public static final Individual Nagios = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Nagios", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>OML Measurement Library (OML) server receives measurement data sent by OML 
     *  clients as OML streams through the OML protocol (OMSP) and stores this data 
     *  into a database (natively support SQlite and PostgreSQL). Website: https://oml.mytestbed.net/projects/oml/wiki/.</p>
     */
    public static final Individual OMLServer = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#OMLServer", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Orbit Measurement Library (OML) Wrapper (https://oml.mytestbed.net/projects/oml/wiki/) 
     *  is a software that acts as an adapter retrieving measurement and monitoring 
     *  data from any monitoring tool and converts this data into OML streams that 
     *  are then sent through the OML Measurement Stream Protocol (OMSP) to an OML 
     *  server.</p>
     */
    public static final Individual OMLWrapper = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#OMLWrapper", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>The end point of the collectin service that offers an OMSP interface to receive 
     *  and store OML measurement streams transfered through the use of the OML Measurement 
     *  Stream Protocol (OMSP).</p>
     */
    public static final Individual OMSPEndpoint = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#OMSPEndpoint", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Ping is a program that can be considered as a tool used for capturing data, 
     *  monitoring or for executing active measurements. The ping program is can be 
     *  used to test wether a particular host is reachable across an IP network. It 
     *  measures the round trip time, packet loss, and some statistical information 
     *  about round trip time (minimum, maximum, average and mean deviation).</p>
     */
    public static final Individual Ping = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Ping", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Is an object-relational database management system. Website: http://www.postgresql.org.</p> */
    public static final Individual PostgreSQL = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#PostgreSQL", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>The end point of the collectin service that offers a SPARQL query interface 
     *  allowing its user to update or query data from triple stores over HTTP protocol.</p>
     */
    public static final Individual SPARQLEndpoint = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#SPARQLEndpoint", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Is is a software library that implements a self-contained, serverless, zero-configuration, 
     *  transactional SQL database engine. Website: https://www.sqlite.org.</p>
     */
    public static final Individual SQLite = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#SQLite", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Tcpdump is a command-line packet analyzer. Website:http://www.tcpdump.org</p> */
    public static final Individual Tcpdump = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Tcpdump", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Traceroute is a computer network tool used to determine the route taken by 
     *  packets across an IP network.</p>
     */
    public static final Individual Traceroute = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Traceroute", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Wireshark is a free and open-source packet analyzer. Website: https://www.wireshark.org</p> */
    public static final Individual Wireshark = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Wireshark", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>Zabbix is a monitoring solution used to monitor computer and network devices. 
     *  For more information visit its website: http://www.zabbix.com.</p>
     */
    public static final Individual Zabbix = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#Zabbix", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
    /** <p>collectd is a monitoring solution used to monitor computer and network devices. 
     *  For more information visit its website: http://collectd.org.</p>
     */
    public static final Individual collectd = m_model.createIndividual( "http://open-multinet.info/ontology/omn-monitoring-tool#collectd", m_model.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    
}
