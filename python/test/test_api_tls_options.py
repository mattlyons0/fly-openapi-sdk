# coding: utf-8

"""
    Fly Machines API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from fly-sdk.models.api_tls_options import ApiTLSOptions  # noqa: E501

class TestApiTLSOptions(unittest.TestCase):
    """ApiTLSOptions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ApiTLSOptions:
        """Test ApiTLSOptions
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ApiTLSOptions`
        """
        model = ApiTLSOptions()  # noqa: E501
        if include_optional:
            return ApiTLSOptions(
                alpn = [
                    ''
                    ],
                default_self_signed = True,
                versions = [
                    ''
                    ]
            )
        else:
            return ApiTLSOptions(
        )
        """

    def testApiTLSOptions(self):
        """Test ApiTLSOptions"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
