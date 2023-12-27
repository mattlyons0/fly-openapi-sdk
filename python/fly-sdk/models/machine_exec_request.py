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


from typing import List, Optional
from pydantic import BaseModel, StrictInt, StrictStr
from pydantic import Field

class MachineExecRequest(BaseModel):
    """
    MachineExecRequest
    """
    cmd: Optional[StrictStr] = Field(default=None, description="Deprecated: use Command instead")
    command: Optional[List[StrictStr]] = None
    timeout: Optional[StrictInt] = None
    __properties = ["cmd", "command", "timeout"]

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
    def from_json(cls, json_str: str) -> MachineExecRequest:
        """Create an instance of MachineExecRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> MachineExecRequest:
        """Create an instance of MachineExecRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return MachineExecRequest.parse_obj(obj)

        _obj = MachineExecRequest.parse_obj({
            "cmd": obj.get("cmd"),
            "command": obj.get("command"),
            "timeout": obj.get("timeout")
        })
        return _obj


