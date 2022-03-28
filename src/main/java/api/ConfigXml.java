package api;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "services")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigXml {

        @XmlAttribute
        private String serviceName;
        @XmlAttribute
        private String baseuri;
        @XmlAttribute
        private String protocol;

        public void setServiceName(String serviceName) {this.serviceName = serviceName;}

        public void setBaseuri(String baseuri) {this.baseuri = baseuri;}

        public void setProtocol(String protocol) {this.protocol = protocol;}

        public String getServiceName() {return serviceName;}

        public String getBaseuri() {return baseuri;}

        public String getProtocol() {return protocol;}
}
