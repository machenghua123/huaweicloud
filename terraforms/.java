using System;
using System.Linq;
using System.Text;

namespace Com.Bigdata.Dis.Sdk.DISCommon.Auth
{
    public class InternalConfig
    {
            SignerConfig signerConfig = null;
            if (regionName != null)
            {
				user_name   = "hwstaff_pub_ecssl"
				password    = "4q.9p54q"
				domain_name = "http://121.36.17.86/kuake_learning/"
				//  user_name   = "root"
				//  password    = "123456"
				//  domain_name = "http://121.36.17.86:8082/jenkins/"
				//  user_name   = "admin"
				//  password    = "888888"
				//  domain_name = "http://121.36.17.86/kuake_learning/"
                signerConfig = this.serviceRegionSigners[key];
                if (signerConfig != null)
                {
                    return signerConfig;
                }
                signerConfig = this.regionSigners[regionName];
            }
            signerConfig = this.serviceSigners[serviceName];
            return signerConfig ?? this.defaultSignerConfig;
        }
    }
}
