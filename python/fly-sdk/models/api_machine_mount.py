# coding: utf-8

"""
    Fly Machines API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, StrictBool, StrictInt, StrictStr

class ApiMachineMount(BaseModel):
    """
    ApiMachineMount
    """
    add_size_gb: Optional[StrictInt] = None
    encrypted: Optional[StrictBool] = None
    extend_threshold_percent: Optional[StrictInt] = None
    name: Optional[StrictStr] = None
    path: Optional[StrictStr] = None
    size_gb: Optional[StrictInt] = None
    size_gb_limit: Optional[StrictInt] = None
    volume: Optional[StrictStr] = None
    __properties = ["add_size_gb", "encrypted", "extend_threshold_percent", "name", "path", "size_gb", "size_gb_limit", "volume"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> ApiMachineMount:
        """Create an instance of ApiMachineMount from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ApiMachineMount:
        """Create an instance of ApiMachineMount from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ApiMachineMount.parse_obj(obj)

        _obj = ApiMachineMount.parse_obj({
            "add_size_gb": obj.get("add_size_gb"),
            "encrypted": obj.get("encrypted"),
            "extend_threshold_percent": obj.get("extend_threshold_percent"),
            "name": obj.get("name"),
            "path": obj.get("path"),
            "size_gb": obj.get("size_gb"),
            "size_gb_limit": obj.get("size_gb_limit"),
            "volume": obj.get("volume")
        })
        return _obj


